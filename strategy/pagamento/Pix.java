package pagamento;

public class Pix implements FormaDePagamento {
    @Override
    public String processar(double valor) {
        double valorFinal = valor * 0.9;
        System.out.println("Gerando QR code PIX...");
        System.out.println("Pagamento confirmado instantaneamente!");
        return "valor a pagar R$ " + valorFinal;
    }
}