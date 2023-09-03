package lab3.cafeteria.decorators;

import lab3.cafeteria.base.Cafe;

abstract class CafeDecorator implements Cafe{
    private Cafe cafe;

    public CafeDecorator(Cafe cafe){
        this.cafe = cafe;
    }

    @Override
    public String getDescricao(){
        return this.cafe.getDescricao();
    }

    @Override
    public double calculaCusto(){
        return this.cafe.calculaCusto();
    }

}
