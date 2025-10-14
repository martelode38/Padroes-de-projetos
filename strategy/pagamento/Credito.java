package pagamento;

public class Credito implements FormaDePagamento {
    @Override
    public String processar(double valor) {
        double valorFinal = valor * 1.1;
        System.out.println("Conectando com operadora...");
        System.out.println("Parcelamento: " + valorFinal + "x de R$ x");
        System.out.println("Pagamento aprovado!");
        return "valor a pagar R$ " + valorFinal;
    }
}