package lab3.cafeteria.base;

public class Descafeinado implements Cafe {
    @Override
    public String getDescricao() {
        return "Descafeinado";
    }

    @Override
    public double calculaCusto() {
        return 2.99;
    }
}
