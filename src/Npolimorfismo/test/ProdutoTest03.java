package Npolimorfismo.test;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Produto;
import Npolimorfismo.domain.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate= new Tomate("Americano", 20);
        tomate.setDataValidade("03/03/2026");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
