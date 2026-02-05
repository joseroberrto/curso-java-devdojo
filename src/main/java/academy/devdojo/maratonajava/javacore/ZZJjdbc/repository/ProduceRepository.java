package academy.devdojo.maratonajava.javacore.ZZJjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZJjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProduceRepository {
    public static void save(Producer producer){
        String sql = "INSERT INTO anime_store.produce (name) VALUES ('%s')".formatted(producer.getName());

        try (Connection con = ConnectionFactory.getConnection();
             Statement stmt = con.createStatement()){

            log.info("Conectado com sucesso ao db");
            int i = stmt.executeUpdate(sql);
            log.info("Inserindo produto '{}' no db,'{}'linhas afetadas", producer.getName(),i);
        }catch (SQLException e){
             log.error("Erro enquandoo tentava inserir produto ao db",e);
        }
    }

    public static void saveTransaction(List<Producer> producers){
        try (Connection con = ConnectionFactory.getConnection();){
            con.setAutoCommit(false);
            preparedStatementSave(producers,con);
            con.commit();

        }catch (SQLException e){
            log.error("Error while trying to save producers '{}'",producers,e);
        }
    }

    public static void preparedStatementSave(List<Producer> producers,Connection con) throws SQLException {
        String sql ="INSERT INTO anime_store.produce (name) VALUES (?)";
        boolean shouldRollback = false;

        for(Producer producer:producers){
            try (PreparedStatement ps = con.prepareStatement(sql)){
                log.info("Saving producer '{}'",producer.getName());
                ps.setString(1,producer.getName());
                if (producer.getName().equals("STK")) throw new SQLException("Can't save producer STK ");
                ps.execute();

            }catch (SQLException e){
                e.printStackTrace();
                shouldRollback = true;
            }
            if(shouldRollback) con.rollback();
        }


    }

    public static void delete(Integer id){
        String sql ="DELETE  FROM anime_store.produce WHERE id='%d'".formatted(id);

        try (Connection con = ConnectionFactory.getConnection();
             Statement stmt = con.createStatement()){

            int i = stmt.executeUpdate(sql);
            log.info("Deletando produto com id'{}' no db,'{}'linhas afetadas", id,i);
        }catch (SQLException e){
            log.error("Erro enquandoo tentava deletar produto {}",id,e);
        }
    }


    public static void update(Producer producer){

        String sql ="UPDATE anime_store.produce SET name='%s' WHERE id='%d'".formatted(producer.getName(),producer.getId());

        try (Connection con = ConnectionFactory.getConnection();
             Statement stmt = con.createStatement()){

            int i = stmt.executeUpdate(sql);
            log.info("Update produto com id'{}','{}'linhas afetadas",producer.getId(),i);
        }catch (SQLException e){
            log.error("Erro enquandoo tentava atualizar produto {}",producer.getId(),e);
        }
    }

    public static void updatePreparedStatement(Producer producer){

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps  =  PreparedStatementUpdate(con,producer.getName(),producer.getId())){

            int i = ps.executeUpdate();
            log.info("Update produto com id'{}','{}'linhas afetadas",producer.getId(),i);
        }catch (SQLException e){
            log.error("Erro enquandoo tentava atualizar produto {}",producer.getId(),e);
        }
    }


    private static PreparedStatement PreparedStatementUpdate(Connection conn , String name,Integer id) throws SQLException {
        String sql ="UPDATE anime_store.produce SET name=? WHERE id= ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,name);
        ps.setInt(2,id);
        return ps;
    }


    public static List<Producer> findAll(){
        return finddByName("");
    }

    public static List<Producer> finddByName(String name){

        String sql ="SELECT * FROM anime_store.produce WHERE name like '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){
                int id = rs.getInt("id");
                String nameDB = rs.getString("name");
                Producer producer = Producer.builder().id(id).name(nameDB).build();
                producers.add(producer);

            }
        }catch (SQLException e){
            log.error("Erro enquandoo tentative buscar produto");
        }

        return producers;
    }

    public static List<Producer> finddByNamePreparedStatement(String name){


        List<Producer> producers = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = PreparedStatementFindByName(con,name);
             ResultSet rs = ps.executeQuery()){

            while (rs.next()){
                int id = rs.getInt("id");
                String nameDB = rs.getString("name");
                Producer producer = Producer.builder().id(id).name(nameDB).build();
                producers.add(producer);

            }
        }catch (SQLException e){
            log.error("Erro enquandoo tentative buscar produto");
        }

        return producers;
    }


    private static PreparedStatement PreparedStatementFindByName(Connection conn , String name) throws SQLException {
        String sql ="SELECT * FROM anime_store.produce WHERE name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,name);
        return ps;
    }

    public static void showProduceMetaDats() {
        log.info("Show Producer Metadata");

        String sql = "SELECT * FROM anime_store.produce";
        List<Producer> producers = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            ResultSetMetaData rsMetaData = rs.getMetaData();
            rs.next();

            int columnCount = rsMetaData.getColumnCount();
            log.info("Column Count:{}",columnCount);

            for (int i = 1; i <= columnCount; i++) {
                log.info("Table Name:{}",rsMetaData.getTableName(i ));
                log.info("Column Name:{}",rsMetaData.getColumnName(i ));
                log.info("Column Size:{}",rsMetaData.getColumnDisplaySize(i ));
                log.info("Column Type:{}",rsMetaData.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            log.error("Erro enquandoo tentative buscar produto");
        }
    }



    public static void showDriverMetaDate() {
        log.info("Show Drive Metadata");

        String sql = "SELECT * FROM anime_store.produce";
        List<Producer> producers = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();) {

            DatabaseMetaData dbMetaDate = con.getMetaData();
            if (dbMetaDate.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Suppots TYPE_FORWARD_ONLY");
                if (dbMetaDate.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Suppots CONCUR_UPDATABLE");
                }
            }

            if (dbMetaDate.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Suppots TYPE_SCROLL_INSENSITIVE");
                if (dbMetaDate.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Suppots CONCUR_UPDATABLE");
                }
            }


            if (dbMetaDate.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Suppots TYPE_SCROLL_INSENSITIVE");
                if (dbMetaDate.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("Suppots CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Erro enquandoo tentative buscar produto");
        }

    }


    public static void showTypeScroolWorking( ){

        String sql ="SELECT * FROM anime_store.produce;";
        List<Producer> producers = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)){
            log.info("Last row ? '{}'",rs.last());
            log.info("Row number '{}'",rs.getRow());
            log.info( Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Fist row ? '{}'",rs.first());
            log.info("Row number '{}'",rs.getRow());
            log.info( Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());


            log.info("Row absolute ? '{}'",rs.absolute(2));
            log.info("Row number '{}'",rs.getRow());
            log.info( Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row relative? '{}'",rs.relative(-1));
            log.info("Row number '{}'",rs.getRow());
            log.info( Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            rs.last();
            rs.next();
            log.info("After last row ? '{}'",rs.isAfterLast());


            while (rs.previous()){
                log.info( Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }




        }catch (SQLException e){
            log.error("Erro enquandoo tentative buscar produto");
        }
    }



    public static List<Producer> finddByNameAndUpdateToUpperCase(String name){

        String sql ="SELECT * FROM anime_store.produce WHERE name like '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){
                rs.updateString("name",rs.getString("name").toUpperCase());
//                rs.cancelRowUpdates();
                rs.updateRow();
                Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
                producers.add(producer);

            }
        }catch (SQLException e){
            log.error("Erro enquandoo tentative buscar produto");
        }
        return producers;
    }


    public static List<Producer> finddByNameAndInsertWhenNotFound(String name){

        String sql ="SELECT * FROM anime_store.produce WHERE name like '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)){

            if (rs.next()) return producers;
            
            insertNewProducer(name, rs);

            producers.add(getProducer(rs));
        }catch (SQLException e){
            log.error("Erro enquandoo tentative buscar produto");
        }
        return producers;
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
        return producer;
    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.updateRow();
    }
}
