package lab3.cafeteria.base;

public class Espresso implements Cafe {
    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public double calculaCusto() {
        return 1.99;
    }
}
