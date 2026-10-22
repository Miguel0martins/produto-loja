package br.com.miguelmartins.produtoloja.model;

public class ProdutoDeAcougue extends Produto implements Perecivel {
    private String tipoDeCarne;
    private double precoEmKg;
    private int diasRestante;

    public void exibirAlertaDeValidade() {
        if (diasRestante <= 5) {
            System.out.println("esta proximo de vencer resta apenas " + diasRestante + " dias");
        } else {
            System.out.println("Não esta proximo de vencer");
        }
    }


    public double getDiasRestante() {
        return diasRestante;
    }

    public void setDiasRestante(double diasRestante) {
        this.diasRestante = (int) diasRestante;
    }


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

    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Tipo de carne: " + tipoDeCarne);
        System.out.println("Preço em kg: " + precoEmKg);
    }
}
