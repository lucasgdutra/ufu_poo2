package lab4.calculadora;

import lab4.calculadora.adaptadores.Calculadora;
import lab4.calculadora.adaptadores.CalculadoraAdapter;
import lab4.calculadora.adaptados.CalculadoraBinaria;

public class Main {
    public static void main(String[] args) {
        CalculadoraBinaria calc = new CalculadoraBinaria();

        // Esperado: 101
        System.out.println("10 + 11 = "+ calc.somar("10", "11"));

        // Esperado: -1
        System.out.println("10 - 11 = "+ calc.subtrair("10", "11"));

        Calculadora calcAdapter = new CalculadoraAdapter();

        // Esperado: 3
        System.out.println("1 + 2 = " + calcAdapter.somar(1, 2));

        // Esperado: -1
        System.out.println("1 - 2 = " + calcAdapter.subtrair(1, 2));

        // Esperado: 9
        System.out.println("3 * 3 = " + calcAdapter.multiplicar(3, 3));
    }
}
