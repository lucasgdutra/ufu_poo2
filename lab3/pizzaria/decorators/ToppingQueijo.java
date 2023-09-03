package lab3.pizzaria.decorators;

import lab3.pizzaria.base.MassaPizza;

public class ToppingQueijo extends ToppingPizzaDecorator{
    public ToppingQueijo(MassaPizza massaPizza){
        super(massaPizza);
    }

    @Override
    public String getDescricao(){
        return massaPizza.getDescricao() + " com Queijo";
    }
}
