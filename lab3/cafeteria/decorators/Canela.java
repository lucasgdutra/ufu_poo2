package lab3.cafeteria.decorators;

import lab3.cafeteria.base.Cafe;

public class Canela extends CafeDecorator {
    public Canela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com Canela";
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.15;
    }

}
