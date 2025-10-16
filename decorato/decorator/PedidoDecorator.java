package decorato.decorator;

public abstract class PedidoDecorator implements ComboInterface {
    protected ComboInterface comboHamburguer;
    
    public PedidoDecorator(ComboInterface combo) {
        this.comboHamburguer = combo;
    }
    
    @Override
    public String getDescricao() {
        return comboHamburguer.getDescricao();
    }
    
    @Override
    public double getValor() {
        return comboHamburguer.getValor();
    }
}
