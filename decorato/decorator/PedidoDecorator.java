package decorato.decorator;

public abstract class PedidoDecorator implements ComboBase {
    protected ComboBase comboHamburguer;
    
    public PedidoDecorator(ComboBase combo) {
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
