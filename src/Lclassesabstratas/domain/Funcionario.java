package Lclassesabstratas.domain;

<<<<<<< HEAD
public  abstract class  Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    public abstract void calcularBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
=======
public abstract class Funcionario extends Pessoa {

    protected String clt;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
>>>>>>> 799f00d
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
<<<<<<< HEAD
                ", salario=" + salario +
                '}';
    }
}
=======
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }
    public  void imprime(){
        System.out.println("Dentro do imprime de funcionario");
    }

    public abstract void calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
>>>>>>> 799f00d
