QUESTÃO 1
Um cenário muito comum em uma aplicação de e-commerce é a existência de diferentes formas de pagamento.
Quando o carrinho de compras é fechado, o usuário deve escolher qual a sua estratégia de pagamento: via Pix, via cartão de crédito ou via boleto bancário.

Implemente o problema descrito utilizando o padrão de projeto Strategy.

Considere as seguintes classes/interfaces para delinear a sua solução:
    - Main
    - CarrinhoCompras
        - adicionaItem
        - removeItem
        - calculaTotal
        - realizaPagamento
    - Item
    - PagamentoStrategy
    - PixPagamento
    - CartaoPagamento
    - BoletoPagamento

QUESTÃO 2 (1 ponto)
Modifique o cenário da Questão 1, para suporte a diferentes estratégias de pagamento de frete (Sedex, Normal). 
Para tanto, adicione o método calculaFrete na classe CarrinhoDeCompras.