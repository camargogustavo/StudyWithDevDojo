package Npolimorfismo.servico;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void CalcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: "+computador.getNome());
        System.out.println("Valor: "+computador.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
    }

    public static void CalcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Alimento: "+tomate.getNome());
        System.out.println("Valor: "+tomate.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
    }

}
