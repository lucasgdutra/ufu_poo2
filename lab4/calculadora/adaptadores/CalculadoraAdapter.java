package lab4.calculadora.adaptadores;

import lab4.calculadora.adaptados.CalculadoraBinaria;

public class CalculadoraAdapter implements Calculadora {
    CalculadoraBinaria calc = new CalculadoraBinaria();

    @Override
    public int somar(int a, int b) {
        return Integer.parseInt(calc.somar(Integer.toBinaryString(a), Integer.toBinaryString(b)), 2);
    }

    @Override
    public int subtrair(int a, int b) {
        return Integer.parseInt(calc.subtrair(Integer.toBinaryString(a), Integer.toBinaryString(b)), 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = somar(result, a);
        }
        return result;
    }
}
