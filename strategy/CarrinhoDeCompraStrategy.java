import pagamento.FormaDePagamento;
import java.util.ArrayList;

public class CarrinhoDeCompraStrategy {
    private ArrayList<Produto> produtos;

    public CarrinhoDeCompraStrategy() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public String calcularValor(FormaDePagamento formaDePagamento) {
        double valor = 0;
        for (Produto produto : produtos) {
            valor += produto.getPreco();
        }
        return formaDePagamento.processar(valor);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}