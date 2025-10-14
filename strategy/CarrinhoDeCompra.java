import java.util.ArrayList;

public class CarrinhoDeCompra {

    private ArrayList<Produto> produtos;

    public CarrinhoDeCompra() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public String calcularValor(String FormaPagamento){
        double valor = 0;
        for (Produto produto : produtos) {
            valor += produto.getPreco();
        }

        if (FormaPagamento.equals("pix")) {
            System.out.println("gerando qr code pix...");
            System.out.println("Pagamento confirmado instantaneamente!");
            return "valor a pagar R$" + valor *  0.9; //desconto por pagamento a vista

        } else if (FormaPagamento.equals("debito")) {
            System.out.println("Conectando com o banco...");
            System.out.println("Digite a senha do cartão: ****");
            System.out.println("Pagamento aprovado!");
            return "valor a pagar R$"  + valor * 0.9;

        }else if (FormaPagamento.equals("credito")) {
            System.out.println("Conectando com operadora...");
            System.out.println("Parcelamento: " + valor + "x de R$ x");
            System.out.println("Pagamento aprovado!");
            
            return "valor a pagar R$" + valor * 1.1;
        }else if (FormaPagamento.equals("boleto")) {
            System.out.println("Gerando código de barras...");
            System.out.println("Código: 34191.79001 01043.510047 91020.150008");
            System.out.println("Vencimento: 3 dias úteis");
            System.out.println("Valor: R$ " + valor * 1.02);
            System.out.println("Status: AGUARDANDO PAGAMENTO");

            return "valor a pagar R$" + valor * 1.02;
        }
        return "Forma de pagamento inválida";
    }
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

}