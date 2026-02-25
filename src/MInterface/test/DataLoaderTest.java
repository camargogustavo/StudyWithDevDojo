package MInterface.test;

import MInterface.domain.DataBaseLoader;
import MInterface.domain.DataLoader;
import MInterface.domain.FileLoader;

import java.io.File;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        System.out.println();
        dataBaseLoader.remove();
        fileLoader.remove();
        System.out.println();
        dataBaseLoader.checkPermission();

        DataLoader.retriveMaxDataSize();
        DataBaseLoader.retriveMaxDataSize();
    }
}
