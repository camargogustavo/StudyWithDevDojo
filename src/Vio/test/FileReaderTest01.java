package Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
         try (FileReader fileReader = new FileReader(file)){
             System.out.println(fileReader.read()); // mostra a posicao da primeira letra
//             char[] in = new char[30];
//             for (char c : in) {
//                 System.out.print(c);
//             }
            int i;
            while ((i=fileReader.read()) != -1){
                System.out.println((char) i);
             }
         } catch (IOException e){
            e.printStackTrace();
         }
    }
}
