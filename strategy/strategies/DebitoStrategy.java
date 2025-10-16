package strategies;

public class DebitoStrategy implements PagamentoInterface {
    @Override
    public String processar(double valor) {
        double valorFinal = valor * 0.9;
        System.out.println("Conectando com o banco...");
        System.out.println("Digite a senha do cartao: ****");
        System.out.println("Pagamento aprovado!");
        return "valor a pagar R$ " + valorFinal;
    }
}