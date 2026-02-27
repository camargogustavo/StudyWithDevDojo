package Npolimorfismo.servico;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Produto;
import Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Produto: " + produto.getValor());
        System.out.println("Produto: " + imposto);
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate)produto).getDataValidade();
            System.out.println(dataValidade);
            //Tomate tomate = (Tomate) produto; pode ser feito dessas duas maneiras
            //System.out.println(tomate.getDataValidade());
        }

    }

}
