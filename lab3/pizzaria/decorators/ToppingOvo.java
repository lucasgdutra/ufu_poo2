package lab3.pizzaria.decorators;

import lab3.pizzaria.base.MassaPizza;

public class ToppingOvo extends ToppingPizzaDecorator{
    public ToppingOvo(MassaPizza massaPizza){
        super(massaPizza);
    }

    @Override
    public String getDescricao(){
        return massaPizza.getDescricao() + " com Ovo";
    }
}
