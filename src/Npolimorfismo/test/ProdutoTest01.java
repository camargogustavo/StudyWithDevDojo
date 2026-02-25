package Npolimorfismo.test;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Book4", 1000);
        Tomate tomate = new Tomate("Tomate Siciliano",10);
        CalculadoraImposto.CalcularImpostoComputador(computador);
        System.out.println("-------");
        CalculadoraImposto.CalcularImpostoTomate(tomate);
    }
}
