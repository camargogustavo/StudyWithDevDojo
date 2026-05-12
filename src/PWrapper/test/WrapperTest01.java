package PWrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        //tamanho do espaco em memoria que esta alocando
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'W';
        boolean booleanP = false;

        //Regras de polimorfismo
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; //autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100.01;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("True");
        System.out.println(verdadeiro);
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
    }
}
