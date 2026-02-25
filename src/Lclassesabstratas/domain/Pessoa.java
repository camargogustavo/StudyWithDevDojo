package Lclassesabstratas.domain;

public abstract class Pessoa {
<<<<<<< HEAD
    public abstract void imprime();
}
=======
    protected String nome;

    public abstract void imprime();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
>>>>>>> 799f00d
