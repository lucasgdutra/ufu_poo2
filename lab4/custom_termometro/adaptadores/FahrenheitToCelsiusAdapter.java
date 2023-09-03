package lab4.custom_termometro.adaptadores;

import lab4.custom_termometro.adaptados.TermometroFahrenheit;

public class FahrenheitToCelsiusAdapter {
    private TermometroFahrenheit termometro;

    public FahrenheitToCelsiusAdapter(TermometroFahrenheit termometro) {
        this.termometro = termometro;
    }

    public double getTemperatura() {
        return (termometro.getTemperatura() - 32) * 5.0 / 9.0;
    }
}
