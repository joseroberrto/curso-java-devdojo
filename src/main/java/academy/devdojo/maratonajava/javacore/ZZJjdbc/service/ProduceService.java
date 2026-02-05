package academy.devdojo.maratonajava.javacore.ZZJjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZJjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJjdbc.repository.ProduceRepository;

import java.util.List;

public class ProduceService {
    public static void save(Producer producer){

        ProduceRepository.save(producer);
    }

    public static void saveTransaction(List<Producer> producers){
        ProduceRepository.saveTransaction(producers);
    }


    public static void delete(Integer id){
        requereValidId(id);
        ProduceRepository.delete(id);
    }

    public static void update(Producer producer){
        requereValidId(producer.getId());
        ProduceRepository.update(producer);
    }
    
    private static void requereValidId(Integer id){
        if (id <= 0 || id == null ){
            throw new IllegalArgumentException("Id invalido");
        }
    }

    public static List<Producer> findAll(){
       return ProduceRepository.findAll();
    }

    public static void showProduceMetaDats(){
        ProduceRepository.showProduceMetaDats();
    }

    public static void showDriveMetaDate(){
        ProduceRepository.showDriverMetaDate();
    }

    public  static void showTypeScroolWorking(){
        ProduceRepository.showTypeScroolWorking();
    }


    public static List<Producer> findByName(String name){
        return ProduceRepository.finddByName(name);
    }

    public static List<Producer> finddByNamePreparedStatement(String name){
        return ProduceRepository.finddByNamePreparedStatement(name);
    }

    public static  void updatePreparedStatement(Producer producer){
        ProduceRepository.updatePreparedStatement(producer);
    }

    public static List<Producer> finddByNameAndUpdateToUpperCase(String name){
        return ProduceRepository.finddByNameAndUpdateToUpperCase(name);
    }
}
