package academy.devdojo.maratonajava.javacore.ZZAclassesInternas;

public class OuterClassesTest01 {
    private String name ="Monkey D. Luffy";

    //nested
    class Inner{
        public void printOuterAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClasses = new OuterClassesTest01();
        Inner inner = outerClasses.new Inner();
        inner.printOuterAttribute();
    }
}
