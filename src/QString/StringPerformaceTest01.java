package QString;

public class StringPerformaceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo gasto para String "+(fim - inicio)+"ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para Stringbuilder "+(fim - inicio)+"ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para Stringbuilder "+(fim - inicio)+"ms");
    }

    public static void concatString(int tamanho){
        String texto = "";
        for (int i = 0;i < tamanho; i++ ){
            texto +=i;
        }
    }

    public static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0;i < tamanho; i++ ){
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho){
        StringBuilder sbuffer = new StringBuilder();
        for (int i = 0;i < tamanho; i++ ){
            sbuffer.append(i);
        }
    }
}
