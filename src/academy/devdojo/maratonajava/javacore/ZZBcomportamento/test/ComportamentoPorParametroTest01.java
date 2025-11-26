package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> carList = List.of(new Car("Blue",2017), new Car("Black",2024), new Car("Red",2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(carList));
        System.out.println("----------------");
        System.out.println(filterByYear(carList,2024));
        System.out.println("----------------------");
        System.out.println(filterCarByColor(carList,"red"));


    }


    private  static List<Car> filterGreenCar(List<Car> cars){
        ArrayList<Car> carsGreen = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equalsIgnoreCase("green")){
                carsGreen.add(car);
            }
        }
        return carsGreen;


    }

    private  static List<Car> filterByYear(List<Car> cars,int year){
        ArrayList<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getYear() < year){
                filterCar.add(car);
            }
        }
        return filterCar;


    }


    private  static List<Car> filterCarByColor(List<Car> cars,String color){
        ArrayList<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equalsIgnoreCase(color)){
                filterCar.add(car);
            }
        }
        return filterCar;


    }
}
