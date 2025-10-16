package decorato.decorator;

public class SaladaExtra extends PedidoDecorator {
    private static final double PRECO_SALADA = 1.5;
    
    public SaladaExtra(ComboInterface comboBase) {
        super(comboBase);
    }

    @Override
    public String getDescricao() {
        return comboHamburguer.getDescricao() + " + Salada Extra";
    }

    @Override
    public double getValor() {
        return comboHamburguer.getValor() + PRECO_SALADA;
    }
    
    public double getPrecoSalada() {
        return PRECO_SALADA;
    }
}