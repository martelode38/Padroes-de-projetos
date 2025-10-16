package decorato.decorator;

public class MainDecorator {
    public static void main(String[] args) {
         ComboInterface pedido1 = new ComboBase("X-Tudo", 20.0);
        pedido1 = new BatataExtra(pedido1);
        pedido1 = new QueijoExtra(pedido1);
        pedido1 = new RefriExtra(pedido1);
        pedido1 = new SaladaExtra(pedido1);
        
        System.out.println(pedido1.getDescricao());
        System.out.println("Total: R$ " + pedido1.getValor());
        
        System.out.println();
        
        ComboInterface pedido2 = new ComboBase("X-Burger", 15.0);
        pedido2 = new BatataExtra(pedido2);
        
        System.out.println(pedido2.getDescricao());
        System.out.println("Total: R$ " + pedido2.getValor());
        
        System.out.println();
        
        // Pedido 3: Queijo duplo
        ComboInterface pedido3 = new ComboBase("X-Bacon", 18.0);
        pedido3 = new QueijoExtra(pedido3);
        pedido3 = new QueijoExtra(pedido3);
        
        System.out.println(pedido3.getDescricao());
        System.out.println("Total: R$ " + pedido3.getValor());
    }
}
