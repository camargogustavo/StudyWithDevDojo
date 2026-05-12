package QString;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Gustavo";
        nome.concat(" Camargo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Gustavo");
        sb.append(" Camargo ");
        System.out.println(sb);
    }
}
