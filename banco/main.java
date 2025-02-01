package banco;

public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");
        
        // Criando contas para os clientes
        Conta conta1 = new Conta(101, cliente1);
        Conta conta2 = new Conta(102, cliente2);
        
        // Criando uma instância do Banco
        Banco banco = new Banco();
        
        // Adicionando contas ao banco
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        
        // Depositando dinheiro nas contas
        conta1.depositar(1000.0);
        conta2.depositar(500.0);
        
        // Exibindo o saldo de cada conta
        System.out.println("Saldo de João (Conta 101): " + conta1.getSaldo());
        System.out.println("Saldo de Maria (Conta 102): " + conta2.getSaldo());
        
        // Realizando uma transferência de João para Maria
        Transacao transferencia = new Transacao(conta1, conta2, 200.0, "TRANSFERÊNCIA"
