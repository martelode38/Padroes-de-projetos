import strategies.BoletoStrategy;
import strategies.CreditoStrategy;
import strategies.DebitoStrategy;
import strategies.PixStrategy;

public class MainRefact {
    public static void main(String[] args) {

        Produto p1 = new Produto("caneta", 1.99);
        Produto p2 = new Produto("borracha", 3.00);
        Produto p3 = new Produto("caderno", 35.00);
        Produto p4 = new Produto("lapis", 0.99);

        System.out.println("========== VERSAO COM STRATEGY ==========\n");

        CarrinhoDeCompraContext c2 = new CarrinhoDeCompraContext();
        c2.adicionarProduto(p1);
        c2.adicionarProduto(p2);
        c2.adicionarProduto(p3);
        c2.adicionarProduto(p4);

        System.out.println("Produtos: " + c2.getProdutos().toString() + "\n");

        System.out.println("--- Pagamento BOLETO ---");
        System.out.println(c2.calcularValor(new BoletoStrategy()));

        System.out.println("\n--- Pagamento PIX ---");
        System.out.println(c2.calcularValor(new PixStrategy()));

        System.out.println("\n--- Pagamento DWBITO ---");
        System.out.println(c2.calcularValor(new DebitoStrategy()));

        System.out.println("\n--- Pagamento CREDITO ---");
        System.out.println(c2.calcularValor(new CreditoStrategy()));
    }
}
