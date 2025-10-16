package decorato.decorator;

public class RefriExtra extends PedidoDecorator {
    private static final double PRECO_REFRI = 2.0;
    
    public RefriExtra(ComboInterface comboBase) {
        super(comboBase);
    }

    @Override
    public String getDescricao() {
        return comboHamburguer.getDescricao() + " + Refri Extra";
    }

    @Override
    public double getValor() {
        return comboHamburguer.getValor() + PRECO_REFRI;
    }
    
    public double getPrecoRefri() {
        return PRECO_REFRI;
    }
}