public class Main {
    
    public static void main(String ... args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionaItem(new Item("livro x", 50, 1, 0.5) );
        carrinho.adicionaItem(new Item("tenis y", 800, 2, 3) );
        
        // supondo que o usuario escolheu pagar com pix
        PagamentoStrategy strategy = new BoletoPagamento();
        FreteStrategy freteStrategy = new SedexFrete();

        carrinho.setFreteStrategy(freteStrategy);
        carrinho.setDistancia(400);
        
        carrinho.realizaPagamento(strategy);
        
    }
    
}