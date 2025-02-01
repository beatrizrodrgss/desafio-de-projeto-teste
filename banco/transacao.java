package banco;

public class Transacao {
    private Conta contaOrigem;
    private Conta contaDestino;
    private double valor;
    private String tipo;

    public Transacao(Conta contaOrigem, Conta contaDestino, double valor, String tipo) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.tipo = tipo;
    }

    public void realizarTransacao() {
        if (tipo.equals("TRANSFERÊNCIA")) {
            contaOrigem.sacar(valor);
            contaDestino.depositar(valor);
        }
    }
}
