package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThredSafeNames{
    private final List<String>names= Collections.synchronizedList(new ArrayList<>());

    public void add(String name){
        names.add(name);
    }

    public void removeFirst(){
    if(!names.isEmpty()){
        System.out.println(Thread.currentThread().getName());
        System.out.println(names.remove(0));
    }
    }
}
public class ThredsSafeTest01 {
    public static void main(String[] args) {
        ThredSafeNames thredSafeNames = new ThredSafeNames();
        thredSafeNames.add("Gon");
        Runnable runnable = thredSafeNames::removeFirst;
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}

