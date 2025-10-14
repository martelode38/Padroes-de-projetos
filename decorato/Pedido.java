package decorato;

public class Pedido {
    private String comboHamburguer;
    private boolean batataExtra;
    private boolean refriExtra;
    private boolean saladaExtra;
    private boolean queijoExtra;
    private double valor;

    public Pedido(String comboHamburguer) {
        this.comboHamburguer = comboHamburguer;
        this.batataExtra = false;
        this.refriExtra = false;
        this.saladaExtra = false;
        this.queijoExtra = false;
        this.valor = 20.0;
    }


    public double calcularValor() {
        double valorTotal = 20.0;
        if (batataExtra) {
            System.out.println("Batata extra adicionada por 2 reais");
            valorTotal += 2.0;
        }
        if (refriExtra) {
            System.out.println("Refri extra adicionado por 2 reais");
            valorTotal += 2.0;
        }
        if (saladaExtra) {
            System.out.println("Salada extra adicionada por 2 reais");
            valorTotal += 2.0;
        }
        if (queijoExtra) {
            System.out.println("Qeurjo extre adicionado por 2 reais");
            valorTotal += 2.0;
        }
        return valorTotal;
    }

    public String getComboHamburguer() {
        return comboHamburguer;
    }

    public void setComboHamburguer(String comboHamburguer) {
        this.comboHamburguer = comboHamburguer;
    }

    public boolean isBatataExtra() {
        return batataExtra;
    }

    public void setBatataExtra(boolean batataExtra) {
        this.batataExtra = batataExtra;
    }

    public boolean isRefriExtra() {
        return refriExtra;
    }

    public void setRefriExtra(boolean refriExtra) {
        this.refriExtra = refriExtra;
    }

    public boolean isSaladaExtra() {
        return saladaExtra;
    }

    public void setSaladaExtra(boolean saladaExtra) {
        this.saladaExtra = saladaExtra;
    }

    public boolean isQueijoExtra() {
        return queijoExtra;
    }

    public void setQueijoExtra(boolean queijoExtra) {
        this.queijoExtra = queijoExtra;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
