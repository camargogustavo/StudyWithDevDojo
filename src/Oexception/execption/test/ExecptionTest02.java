package Oexception.execption.test;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class ExecptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\arquivo.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado"+isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
