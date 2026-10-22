public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Banana");
        produto.setEstoque(0);
        produto.AdicionarEstoque(10);
        produto.RemoverEstoque(3);
        produto.exibirFicha();

        ProdutoDePadaria padaria = new ProdutoDePadaria();
        padaria.setNome("Pão francês");
        padaria.setEstoque(50);
        padaria.setDiasRestante(3);
        padaria.setDataDeFabricacao("01/01/2099");

        padaria.exibirFicha();
        padaria.exibirAlertaDeValidade();

        Perecivel item = padaria;
        item.exibirAlertaDeValidade();

        ProdutoDeAcougue acougue = new ProdutoDeAcougue();
        acougue.setNome("açougue");
        acougue.setTipoDeCarne("picanha");
        acougue.setEstoque(20);
        acougue.setPrecoEmKg(49.90);
        acougue.setDiasRestante(7);
        acougue.exibirFicha();

        Perecivel a = padaria;
        Perecivel b = acougue;

        a.exibirAlertaDeValidade();
        b.exibirAlertaDeValidade();

    }
}