package lab4.aves;

import lab4.aves.adaptadores.Ave;
import lab4.aves.adaptados.Pato;
import lab4.aves.adaptados.Pavao;
import lab4.aves.especies.PatoDomestico;
import lab4.aves.especies.PavaoAzul;

public class Main {
    public static void main(String[] args) {
        Pato pato = new Pato();
        Pavao pavao = new Pavao();

        Ave patoDomestico = new PatoDomestico(pato);
        Ave pavaoAzul = new PavaoAzul(pavao);

        patoDomestico.emitirSom();
        patoDomestico.voar();

        //quebra de linha
        System.out.println();
        
        pavaoAzul.emitirSom();
        pavaoAzul.voar();

    }
}
