package QString;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "     Gustavo     ";
        String numeros = "012345";
        System.out.println(nome.charAt(1));
        System.out.println(nome.length());
        System.out.println(nome.replace("G","F"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        System.out.println(nome.substring(0,2));
        System.out.println(nome);
        System.out.println(nome.trim());

    }
}
