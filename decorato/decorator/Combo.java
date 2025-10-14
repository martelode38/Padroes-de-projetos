package decorato.decorator;

public class Combo implements ComboBase {
    private String nome;
    private double valorBase;
    
    public Combo(String nome, double valorBase) {
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