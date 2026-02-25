package MInterface.domain;

public class DataBaseLoader implements DataLoader, DataRemover {
    //private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de Dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão no banco de dados");
    }

    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retriveDataSize na class DataBasel oader");
    }
}
