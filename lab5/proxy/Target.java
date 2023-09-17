package lab5.proxy;

public class Target implements Imethods {
    public void method1() {
        return;
    }

    public String method2() {

        return "method2 result";
    }

    public double method3() {

        return 3.0;
    }
}
