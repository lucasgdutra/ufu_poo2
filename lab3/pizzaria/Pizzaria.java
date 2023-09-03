package lab3.pizzaria;

import lab3.pizzaria.base.MassaEspessaPizza;
import lab3.pizzaria.base.MassaFinaPizza;
import lab3.pizzaria.base.MassaPizza;
import lab3.pizzaria.decorators.ToppingOvo;
import lab3.pizzaria.decorators.ToppingQueijo;
import lab3.pizzaria.decorators.ToppingTomate;

public class Pizzaria {
    public static void main(String[] args) {
        MassaPizza pizzaMarguerita = new ToppingTomate(
                new ToppingQueijo(
                        new MassaFinaPizza()));
        System.out.println(pizzaMarguerita.getDescricao());

        MassaPizza pizzaPortuguesa = new ToppingOvo(
                new ToppingTomate(
                        new ToppingQueijo(
                                new MassaEspessaPizza())));
        System.out.println(pizzaPortuguesa.getDescricao());
    }

}
