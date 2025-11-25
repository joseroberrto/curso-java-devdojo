package academy.devdojo.maratonajava.javacore.ZZAclassesInternas;

public class OuterClassesTest02 {
    private String name="Midorya";

    //para acesar a ClassLocal é necessario inicializala atravez do metodo print
    private void print(){
        String lastname="Izuku";//final
        class ClassLocal{//final ou abstract
            public void printName(){
                System.out.println(name+" "+lastname);
            }

        }
        ClassLocal classLocal = new ClassLocal();
        classLocal.printName();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print();
    }
}
