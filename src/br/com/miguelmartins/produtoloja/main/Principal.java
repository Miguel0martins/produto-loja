package br.com.miguelmartins.produtoloja.main;

import br.com.miguelmartins.produtoloja.model.*;


public class Principal {
    public static void main(String[] args) {
        Produto fruta = new Produto();
        System.out.println("=====Produto======");
        fruta.setNome("Banana");
        fruta.setEstoque(0);
        fruta.AdicionarEstoque(10);
        fruta.RemoverEstoque(3);
        fruta.exibirFicha();

        System.out.println("---------------");
        ProdutoDePadaria padaria = new ProdutoDePadaria();
        System.out.println("=====PADARIA======");
        padaria.setNome("Pão francês");
        padaria.setEstoque(50);
        padaria.setDiasRestante(3);
        padaria.setDataDeFabricacao("01/01/2099");

        padaria.exibirFicha();
        padaria.exibirAlertaDeValidade();

        Perecivel item = padaria;
        item.exibirAlertaDeValidade();

        System.out.println("---------------");
        ProdutoDeAcougue acougue = new ProdutoDeAcougue();
        System.out.println("=====AÇOUGUE======");
        acougue.setNome("Carne bovina");
        acougue.setTipoDeCarne("picanha");
        acougue.setEstoque(20);
        acougue.setPrecoEmKg(49.90);
        acougue.setDiasRestante(7);
        acougue.exibirFicha();

        System.out.println("---------------");


        Perecivel a = padaria;
        Perecivel b = acougue;

    System.out.println("=====ALERTAS======");

        a.exibirAlertaDeValidade();
        b.exibirAlertaDeValidade();


    }
}