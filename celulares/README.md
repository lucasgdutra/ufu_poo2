Considere o domínio de celulares.

Existem as empresas fabricantes de celulares, por exemplo: Apple e Samsung.

E cada fabricante é capaz de construir diferentes modelos de celulares, por exemplo: Galaxy8, Galaxy20, IPhoneX e IPhoneS.

Construa um programa Java, capaz de reproduzir o cenário acima.

Seu programa deve:
- conter uma classe Main, que demonstrará o funcionamento
- conter uma interface FabricanteCelular, com o método:
 - public Celular constroiCelular(String modelo);
- conter uma interface Celular, com os métodos:
    - public void fazLigacao();
    - public void tiraFoto();
- utilizar o padrão de projeto Fábrica para construção de celulares;
- utilizar o padrão de projeto Singleton para criação de fabricantes.