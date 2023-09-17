package lab5.proxy;

public class Main {
    public static void main(String[] args) {
        Imethods target = new Target();

        // A classe LoggingProxy é um proxy para a classe Target que simula um logger
        // para os métodos da classe Target através de System.out.println
        Imethods proxy = new LoggingProxy(target);
        proxy.method1(); //void
        System.out.println(proxy.method2()); //String
        System.out.println(proxy.method3()); //double
    }
}
