package Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");
    }

    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo");
    }
}
