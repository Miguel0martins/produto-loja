public class ProdutoDeAcougue extends Produto {
    private String tipoDeCarne;
    private double precoEmKg;

    public double getPrecoEmKg() {
        return precoEmKg;
    }

    public void setPrecoEmKg(double precoEmKg) {
        this.precoEmKg = precoEmKg;
    }

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    void exibirFicha() {
        System.out.println("Tipo de carne: " + tipoDeCarne);
        System.out.println("Preço em kg: " + precoEmKg);
    }
}
