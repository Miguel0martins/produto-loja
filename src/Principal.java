public class Principal {
 public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Banana");
        produto.setEstoque (0);


        produto.AdicionarEstoque(10);
        produto.RemoverEstoque(3);

     produto.exibirFicha();


 }
}
