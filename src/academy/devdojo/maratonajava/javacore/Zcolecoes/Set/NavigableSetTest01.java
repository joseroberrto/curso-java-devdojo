package academy.devdojo.maratonajava.javacore.Zcolecoes.Set;

import academy.devdojo.maratonajava.javacore.Zcolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

class  SmartphoneMarcaComparato implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone smartphone, Smartphone t1) {
        return smartphone.getSerialNumber().compareTo(t1.getSerialNumber());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphoneNavigableSet = new TreeSet<>(new SmartphoneMarcaComparato());
        Smartphone smartphone01 = new Smartphone("4536","Nokia");
        Smartphone smartphone03 = new Smartphone("3934","Assus");
        Smartphone smartphone02 = new Smartphone("1230","Samsung");
        smartphoneNavigableSet.add(smartphone01);
        smartphoneNavigableSet.add(smartphone03);
        smartphoneNavigableSet.add(smartphone02);


        for (Smartphone smartphone : smartphoneNavigableSet) {
            System.out.println(smartphone);
        }


    }
}
