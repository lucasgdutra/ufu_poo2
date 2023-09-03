package lab3.pizzaria.decorators;

import lab3.pizzaria.base.MassaPizza;

public class ToppingTomate extends ToppingPizzaDecorator {
    public ToppingTomate(MassaPizza massaPizza) {
        super(massaPizza);
    }

    @Override
    public String getDescricao() {
        return massaPizza.getDescricao() + " com Tomate";
    }
}
