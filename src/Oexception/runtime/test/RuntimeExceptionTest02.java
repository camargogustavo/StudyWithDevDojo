package Oexception.runtime.test;

public class RuntimeExceptionTest02 {

    public static void main(String[] args) {
        divisao(1,0);

        /**
         * @param a nao pode ser zero
         * @param b nao pode ser zero
         * @throws IllegalArgumentException
         */
    }


    private static int divisao(int a, int b) throws IllegalArgumentException{
        if (a == 0 || b == 0){
            throw new IllegalArgumentException("Nao pode ser divido por 0");
        }
        return a/b;
    }
}
