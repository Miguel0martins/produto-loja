package br.com.miguelmartins.produtoloja.model;

public class Produto {
    private String Nome;
    private int Estoque;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }


    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int Estoque) {
        if (Estoque >= 0) {
            this.Estoque = Estoque;
        } else {
            System.out.println("Estoque não pode ser negativo");
        }
    }

   public void AdicionarEstoque(int quantidade) {
        Estoque += quantidade;
    }

   public void RemoverEstoque(int quantidade) {
        if (quantidade <= Estoque) {
            Estoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

   public void exibirFicha() {
       System.out.println("Produto: " + Nome);
        System.out.println("Estoque: " + Estoque);
    }

}
