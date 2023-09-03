package lab4.custom_termometro;

import lab4.custom_termometro.adaptadores.FahrenheitToCelsiusAdapter;
import lab4.custom_termometro.adaptados.TermometroFahrenheit;

public class Main {
    public static void main(String[] args) {
        TermometroFahrenheit termometro = new TermometroFahrenheit();
        FahrenheitToCelsiusAdapter adapter = new FahrenheitToCelsiusAdapter(termometro);
        System.out.println("Temperatura em Fahrenheit: " + termometro.getTemperatura());
        System.out.println("Temperatura em Celsius: " + adapter.getTemperatura());
    }
}
