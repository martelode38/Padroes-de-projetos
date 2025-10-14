package decorato;

public class Main {
    public static void main(String[] args) {
        
        Pedido pedido = new Pedido("X-Tudo");

        // Adicionando extras
        pedido.setBatataExtra(true);
        pedido.setRefriExtra(true);
        pedido.setSaladaExtra(true);
        pedido.setQueijoExtra(true);
        System.out.println("Pedido final: " + pedido.getComboHamburguer() + " - Valor: " + pedido.calcularValor());
        pedido.setBatataExtra(false);
        System.out.println("Pedido final: " + pedido.getComboHamburguer() + " - Valor: " + pedido.calcularValor());
    }
    
}
