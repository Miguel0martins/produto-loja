public class Principal {
 public static void main(String[] args) {
        Produto produto = new Produto();

        produto.Nome = "banana";
        produto.Estoque = 0;

        produto.AdicionarEstoque(10);
        produto.RemoverEstoque(3);

     produto.exibirFicha();


 }
}
