package Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        // checked e uncxhecked
        abrirConexao();
    }

    private static String abrirConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso");
        }
        return null;
    }
    private static void abrirConexao2() {
        try { //try so é execu
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");

        } finally {// nao importa o que aconteca ele é executado
            System.out.println("Fechando recurso");
        }

    }
}
