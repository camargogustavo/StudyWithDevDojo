package Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Create "+isCreate);
            System.out.println("path "+file.getPath());
            System.out.println("path "+file.getAbsolutePath());
            System.out.println("Directory "+file.isDirectory());
            System.out.println("Oculto "+file.isHidden());
            System.out.println("last modified "+ new Date(file.lastModified()));
            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted "+file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
