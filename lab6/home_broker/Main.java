package lab6.home_broker;

public class Main {
    public static void main(String[] args) {
        AcaoObservable acao = new AcaoObservable("PETR4", 10);
        AcaoBrokerObserver broker = new AcaoBrokerObserver(9, 11);
        acao.addObserver(broker);

        System.out.println("Nome: " + broker.getNome());
        System.out.println("Valor: " + broker.getValor());
        System.out.println("Quantidade: " + broker.getQuantidade());

        acao.setValor(8);
        acao.notifyObservers();

        System.out.println("Nome: " + broker.getNome());
        System.out.println("Valor: " + broker.getValor());
        System.out.println("Quantidade: " + broker.getQuantidade());

        acao.setValor(12);
        acao.notifyObservers();

        System.out.println("Nome: " + broker.getNome());
        System.out.println("Valor: " + broker.getValor());
        System.out.println("Quantidade: " + broker.getQuantidade());
    }
}
