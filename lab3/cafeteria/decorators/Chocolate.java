package lab3.cafeteria.decorators;

import lab3.cafeteria.base.Cafe;

public class Chocolate extends CafeDecorator {
    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com Chocolate";
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.20;
    }
}
