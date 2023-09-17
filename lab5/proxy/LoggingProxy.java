package lab5.proxy;

public class LoggingProxy implements Imethods{
    private Imethods target;

    public LoggingProxy(Imethods target) {
        this.target = target;
    }

    public void method1() {
        System.out.println("method1 called");
        target.method1();
    }

    public String method2() {
        System.out.println("method2 called");
        return target.method2();
    }

    public double method3() {
        System.out.println("method3 called");
        return target.method3();
    }
}
