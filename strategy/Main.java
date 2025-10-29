public class Main {

   public static void main(String[] args) {

       Produto p1 = new Produto("caneta", 1.99);
       Produto p2 = new Produto("borracha", 3.00);
       Produto p3 = new Produto("caderno", 35.00);
       Produto p4 = new Produto("lapis", 0.99);

       System.out.println("========== VERSAO COM IF/ELSE ==========\n");

       CarrinhoDeCompra c1 = new CarrinhoDeCompra();
       c1.adicionarProduto(p1);
       c1.adicionarProduto(p2);
       c1.adicionarProduto(p3);
       c1.adicionarProduto(p4);

       System.out.println("Produtos: " + c1.getProdutos().toString() + "\n");

       System.out.println("--- Pagamento BOLETO ---");
       System.out.println(c1.calcularValor("boleto"));

       System.out.println("\n--- Pagamento PIX ---");
       System.out.println(c1.calcularValor("pix"));

       System.out.println("\n--- Pagamento DEBITO ---");
       System.out.println(c1.calcularValor("debito"));

       System.out.println("\n--- Pagamento CREDITO ---");
       System.out.println(c1.calcularValor("credito"));
   }
}