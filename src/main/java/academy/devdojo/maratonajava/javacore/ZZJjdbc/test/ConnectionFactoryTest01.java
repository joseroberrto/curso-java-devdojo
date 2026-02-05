package academy.devdojo.maratonajava.javacore.ZZJjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZJjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJjdbc.repository.ProduceRepository;
import academy.devdojo.maratonajava.javacore.ZZJjdbc.service.ProduceService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ConnectionFactoryTest01 {
    private static final Logger log = LogManager.getLogger(ConnectionFactoryTest01.class);

    public static void main(String[] args) {
//        Producer producer = Producer.builder().name("Mappa").build();
        Producer producerToUpdate = Producer.builder().id(2).name("Lucas Filme").build();
//       ProduceService.update(producerToUpdate);
//       List<Producer> all = ProduceService.findAll();
//       List<Producer> all = ProduceService.findByName("Na");
//        log.info("Produto encontrado com sucesso{}",all);
//
//        ProduceService.showProduceMetaDats();
//
//        ProduceService.showDriveMetaDate();
//
//        ProduceService.showTypeScroolWorking();

////        List<Producer> producers = ProduceService.finddByNameAndUpdateToUpperCase("Na");
//        log.info("ProduceService finddByNameAndUpdateToUpperCase() = {}",producers);

        ProduceService.updatePreparedStatement(producerToUpdate);
    }
}
