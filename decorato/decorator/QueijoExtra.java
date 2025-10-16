package decorato.decorator;

public class QueijoExtra extends PedidoDecorator {
    private static final double PRECO_QUEIJO = 2.0;
    
    public QueijoExtra(ComboInterface comboBase) {
        super(comboBase);
    }

    @Override
    public String getDescricao() {
        return comboHamburguer.getDescricao() + " + Queijo Extra";
    }

    @Override
    public double getValor() {
        return comboHamburguer.getValor() + PRECO_QUEIJO;
    }
    
    public double getPrecoQueijo() {
        return PRECO_QUEIJO;
    }
}