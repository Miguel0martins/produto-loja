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
    }
}