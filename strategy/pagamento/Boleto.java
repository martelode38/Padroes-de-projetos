package pagamento;

public class Boleto implements FormaDePagamento {
    @Override
    public String processar(double valor) {
        double valorFinal = valor * 1.02;
        System.out.println("Gerando codigo de barras...");
        System.out.println("Código: 34191.79001 01043.510047 91020.150008");
        System.out.println("Vencimento: 3 dias úteis");
        System.out.println("Status: AGUARDANDO PAGAMENTO");
        return "valor a pagar R$ " + valorFinal;
    }
}