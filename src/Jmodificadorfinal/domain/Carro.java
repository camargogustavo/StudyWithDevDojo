package Jmodificadorfinal.domain;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMTIE = 250;
    public final Comprador COMPRADOR = new Comprador();
    //public static final double VELOCIDADE_LIMTIE; // sempre antes de utilizar essa variavel tem que tem um valor
    //Constantes no java tem uma convecao propria, tudo em UperCase é separador por underscore
    //static { só consigo inicializar estar bloco static quando a variavel tiver o static no nome
    //    VELOCIDADE_LIMTIE = 250;
    //}
    //{ sem o static decladara na varivel consigo incializar ela no construtor ou no bloco de inicilizacao
    //    VELOCIDADE_LIMTIE = 250;
    //}

    public void imprime(){
        System.out.println(this.nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
