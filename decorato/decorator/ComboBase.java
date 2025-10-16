package decorato.decorator;
public class ComboBase implements ComboInterface {
    private String nome;
    private double valorBase;
    
    public ComboBase(String nome, double valorBase) {
        this.nome = nome;
        this.valorBase = valorBase;
    }
    
    @Override
    public String getDescricao() {
        return nome;
    }
    
    @Override
    public double getValor() {
        return valorBase;
    }
}