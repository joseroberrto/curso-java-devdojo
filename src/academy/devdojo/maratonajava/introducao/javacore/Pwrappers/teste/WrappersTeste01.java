package academy.devdojo.maratonajava.introducao.javacore.Pwrappers.teste;

public class WrappersTeste01 {

    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP =1;
        long longP = 10L;
        double doubleP = 10;
        float floatP = 12;
        char charP = 'W';
        boolean booleanP = true;

        //autoboxing onde transfroma um tipo primitivo em wrapper
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW =1;
        Long longW = 10L;
        Double doubleW = 10D;
        Float floatW = 12F;
        Character charW = 'W';
        Boolean booleanW = true;

        int i = intW; //unboxing tranformar um wrapper em tipo primitivo

        //metodos de classes wrappers
        intP = intW.shortValue();
        System.out.println(intP);

        System.out.println(Boolean.parseBoolean("tRuE"));
        System.out.println(Character.isAlphabetic('1'));
        System.out.println(Character.isLetter('Q'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('a'));



    }
}
