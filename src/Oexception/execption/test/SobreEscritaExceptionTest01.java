package Oexception.execption.test;

import Oexception.execption.domain.Funcionario;
import Oexception.execption.domain.Pessoa;

public class SobreEscritaExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        funcionario.salvar();
    }
}
