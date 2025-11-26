package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> carList = List.of(new Car("green",2014),new Car("Blue",2017), new Car("Black",2024), new Car("Red",2019));

    public static void main(String[] args) {
//        List<Car>greenCars = filter(carList, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equalsIgnoreCase("green");
//            }
//        });

        /// usando lambda
        List<Car>greenCars = filter(carList,car -> car.getColor().equalsIgnoreCase("green"));
        List<Car>redCars = filter(carList,car -> car.getColor().equalsIgnoreCase("red"));

        System.out.println(greenCars);
        System.out.println(redCars);


        //usando a classes generics e lambdas
        List<Integer>nums = List.of(1,2,3,4,5,6,6,7,8,9);
        System.out.println(filter(nums,integer -> integer%2==0));







    }

//    private  static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
//        ArrayList<Car> filterCar = new ArrayList<>();
//        for (Car car : cars) {
//            if(carPredicate.test(car)){
//                filterCar.add(car);
//            }
//        }
//        return filterCar;
//
//
//    }
    
    private static <T> List<T> filter(List<T>list, Predicate<T>predicate){
        ArrayList<T>listT =new ArrayList<>();
        for (T t : listT) {
            if(predicate.test(t)){
                list.add(t);
            }
        }

        return list;

    }



}
