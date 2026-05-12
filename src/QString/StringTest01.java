package QString;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Gustavo";//String constant pool
        String nome2 = "Gustavo";
        nome.concat("Camargo");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Gustavo");// 1 VARIVEL DE REFERENCIA, 2 OBJETO DO TIPO STRING, 3 UM STRING NO POOL DE STRING
        System.out.println(nome2 ==  nome3);
        System.out.println(nome2 ==  nome3.intern());

    }
}
