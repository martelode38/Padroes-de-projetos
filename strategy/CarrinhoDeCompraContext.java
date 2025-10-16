import java.util.ArrayList;

import strategies.PagamentoInterface;

public class CarrinhoDeCompraContext {
    private ArrayList<Produto> produtos;

    public CarrinhoDeCompraContext() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public String calcularValor(PagamentoInterface formaDePagamento) {
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