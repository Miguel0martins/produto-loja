public class ProdutoDePadaria extends Produto {
    private double diasRestante;
    private String dataDeFabricacao;

    public double getDiasRestante() {
        return diasRestante;
    }

    public void setDiasRestante(double diasRestante) {
        this.diasRestante = diasRestante;
    }

    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    void exibirFicha() {
        super.exibirFicha();
        System.out.println("Dias restantes: " + diasRestante);
        System.out.println("Data de fabricação: " + dataDeFabricacao);
    }
}