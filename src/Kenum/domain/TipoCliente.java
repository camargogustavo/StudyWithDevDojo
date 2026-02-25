package Kenum.domain;

<<<<<<< HEAD
public enum TipoCliente {
    //todos os atributos criados vao ser constantes
    PESSOA_JURIDICA(1, "Pessoa Juridica"),
    PESSOA_FISICA(2, "Pessoa Fisica");

    public int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente TipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
=======

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica"){
        public String getId(){
            return "B";
        }
    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId(){
        return "A";
    }
    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
>>>>>>> 799f00d
