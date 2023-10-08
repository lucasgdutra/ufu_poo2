package lab7;

import java.util.List;

public class Main {
    public static void  main(String args[]){
        Item item1 = new Item("Item 1", 10);
        Item item2 = new Item("Item 2", 20);
        

        PedidoLojaTemplate Loja1 = new Loja1(CanalVendas.LOJA, TipoPagamento.CARTAO, List.of(item1, item2));
        System.out.println("Loja 1");
        Loja1.processarPagamento();

        PedidoLojaTemplate Loja2 = new Loja2(CanalVendas.ONLINE, TipoPagamento.CARTAO, List.of(item1, item2));
        System.out.println("Loja 2");
        Loja2.processarPagamento();
        
    }
}
