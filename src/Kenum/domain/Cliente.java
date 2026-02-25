package Kenum.domain;

<<<<<<< HEAD
public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento TipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento TipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.TipoPagamento = TipoPagamento;
    }



=======
/**
 * Created by William Suane on 5/12/2016.
 */
public class Cliente {
    public enum TipoPagamento {
        AVISTA, APRAZO
    }
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

>>>>>>> 799f00d
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
<<<<<<< HEAD
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.valor +
                ", TipoPagamento=" + TipoPagamento +
                '}';
    }
}
=======
                ", tipoCliente=" + tipoCliente.getNome() +
                ", tipoPagamento=" + tipoPagamento +
                ", numero="+ tipoCliente.getTipo() +
                '}';
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
>>>>>>> 799f00d
