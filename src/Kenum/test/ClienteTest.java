package Kenum.test;

import Kenum.domain.Cliente;
import Kenum.domain.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gustavo", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_JURIDICA);
        System.out.println(TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);

    }
}
