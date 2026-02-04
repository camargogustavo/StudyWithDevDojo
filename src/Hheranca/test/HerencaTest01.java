package Hheranca.test;

import Hheranca.domain.Endereco;
import Hheranca.domain.Funcinario;
import Hheranca.domain.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("12120312");
        endereco.setRua("Odete");
        Pessoa pessoa = new Pessoa("Gustavo");
        pessoa.setCpf("4490900805");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcinario funcinario = new Funcinario("Alana");
        funcinario.setCpf("54248723048");
        funcinario.setEndereco(endereco);
        funcinario.setSalario(10101);
        System.out.println("-----");
        funcinario.imprime();
    }
}
