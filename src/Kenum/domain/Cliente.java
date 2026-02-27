package Kenum.domain;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento TipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento TipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.TipoPagamento = TipoPagamento;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.valor +
                ", TipoPagamento=" + TipoPagamento +
                '}';
    }
}