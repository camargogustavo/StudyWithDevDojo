package Npolimorfismo.test;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Televisao;
import Npolimorfismo.domain.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Book4", 1000);
        Tomate tomate = new Tomate("Tomate Siciliano",10);
        Televisao tv = new Televisao("Samsung 50\"",5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
