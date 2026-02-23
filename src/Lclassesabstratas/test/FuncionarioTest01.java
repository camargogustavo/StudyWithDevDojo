package Lclassesabstratas.test;

import Lclassesabstratas.domain.Desenvolvedor;
import Lclassesabstratas.domain.Funcionario;
import Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alana",5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toya",12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
