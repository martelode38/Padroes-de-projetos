package decorato.decorator;

public class BatataExtra extends PedidoDecorator {
    private static final double PRECO_BATATA = 2.0;
    
    public BatataExtra(ComboBase comboBase) {
        super(comboBase);
    }

    @Override
    public String getDescricao() {
        return comboHamburguer.getDescricao() + " + Batata Extra";
    }

    @Override
    public double getValor() {
        return comboHamburguer.getValor() + PRECO_BATATA;
    }
    
    public double getPrecoBatata() {
        return PRECO_BATATA;
    }
}