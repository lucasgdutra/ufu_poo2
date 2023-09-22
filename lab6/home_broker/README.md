QUESTÃO 2 (2 pontos)
Considere um problema no domínio do mercado financeiro. Neste cenário existem as ações
(Acao) e cada ação contém uma lista de Investidores (Investidor) que estão associados às
mesmas. Cada investidor possui um corretor (AcaoBroker) AcaoBroker que é responsável
por comprar e vender ações. O AcaoBroker recebe os comandos para vender e comprar
ações.
Faça o projeto usando o padrão Observer para os Investidores serem notificados das
variações de preço de suas ações. Cada investidor poderá definir limites mínimos e
máximos no preço de suas ações. Quando o preço máximo for atingido, as ações deverão
ser vendidas, ou seja, o AcaoBroker deverá receber o comando.