public class Produto {
        String Nome;
        int quantidade;
        int Estoque;

        void AdicionarEstoque(int quantidade) {
                Estoque += quantidade;
        }

        void RemoverEstoque(int quantidade) {
                Estoque -= quantidade;
        }

        void exibirFicha() {
                System.out.println("Produto: " + Nome);
                System.out.println("Estoque: " + Estoque);
        }

    }
