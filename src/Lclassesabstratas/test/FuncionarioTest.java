package Lclassesabstratas.test;

import Lclassesabstratas.domain.Gerente;
import Lclassesabstratas.domain.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alana","222-1", 2000);
        Vendedor vendedor = new Vendedor("Gustavo","222-1",3000, 5000);
        vendedor.calculaSalario();
        gerente.calculaSalario();
        System.out.println(gerente);
        System.out.println("---------");
        System.out.println(vendedor);
    }
}