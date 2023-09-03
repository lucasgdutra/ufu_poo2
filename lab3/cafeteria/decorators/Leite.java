package lab3.cafeteria.decorators;

import lab3.cafeteria.base.Cafe;

public class Leite extends CafeDecorator {
    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com Leite";
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.25;
    }
}
