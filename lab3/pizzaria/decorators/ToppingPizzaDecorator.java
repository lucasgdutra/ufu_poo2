package lab3.pizzaria.decorators;

import lab3.pizzaria.base.MassaPizza;

abstract class ToppingPizzaDecorator implements MassaPizza{
    protected MassaPizza massaPizza;
    
    public ToppingPizzaDecorator(MassaPizza massaPizza){
        this.massaPizza = massaPizza;
    }

    public String getDescricao(){
        return massaPizza.getDescricao();
    }
}
