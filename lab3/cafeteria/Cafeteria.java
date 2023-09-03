package lab3.cafeteria;

import lab3.cafeteria.base.Cafe;
import lab3.cafeteria.base.Descafeinado;
import lab3.cafeteria.base.Espresso;
import lab3.cafeteria.decorators.Canela;
import lab3.cafeteria.decorators.Leite;

public class Cafeteria {
    public static void main(String[] args) {
        Cafe espresso = new Espresso();
        System.out.println(espresso.getDescricao() + " = " + espresso.calculaCusto());

        // Espresso com leite
        Cafe espressoComLeite = new Leite(espresso);
        System.out.println(espressoComLeite.getDescricao() + " = " + espressoComLeite.calculaCusto());

        // Descafeinado com leite e canela
        Cafe descafeinadoComLeiteECanela = new Leite(new Canela(new Descafeinado()));
        System.out.println(descafeinadoComLeiteECanela.getDescricao() + " = " + descafeinadoComLeiteECanela.calculaCusto());
    }
}