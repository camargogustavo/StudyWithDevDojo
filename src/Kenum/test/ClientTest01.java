package Kenum.test;

import Kenum.domain.Cliente;
import Kenum.domain.TipoCliente;
import Kenum.domain.TipoPagamento;

public class ClientTest01 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gustavo", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente c2 = new Cliente("Alana", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto    (100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        // 1. Usando o método padrão do Java (Precisa ser o nome da CONSTANTE)
        TipoCliente tipo1 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println("Pelo valueOf: " + tipo1);

// 2. Usando o SEU método customizado (Aceita o nome do relatório)
        TipoCliente tipo2 = TipoCliente.TipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println("Pelo seu método: " + tipo2);

//        TipoCliente tipoCliente = TipoCliente.valueOf("Pessoa Fisica");
//        System.out.println(tipoCliente);
//        TipoCliente tipoCliente2 = TipoCliente.TipoClientePorNomeRelatorio("Pessoa Fisica");
//        System.out.println(tipoCliente2);
    }
}
