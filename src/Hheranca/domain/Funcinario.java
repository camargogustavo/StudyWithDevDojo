package Hheranca.domain;

public class Funcinario extends Pessoa{
    private double salario;
    //SUPEr eu me refiro ao objeto que esta chamando o objeto de outra class
    static {
        System.out.println("Dentro do bloco inicializacao static de Pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicializacao de Pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicializacao de Pessoa 2");
    }

    public Funcinario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de pessoa");
    }

    public void imprime(){
        super.imprime(); // executa o metedo imprimi da class Pessoa
        System.out.println(this.salario); // adiciona na linha de baixo o this.salario
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+"eu recebi o salario de: "+this.salario);
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
