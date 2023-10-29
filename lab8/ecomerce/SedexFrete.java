import java.util.List;

public class SedexFrete implements FreteStrategy{

    @Override
    public double calcularFrete(List<Item> items, double distancia) {
        double peso = 0;
        double volume = 0;
        for (Item item : items) {
            peso += item.getPeso();
            volume += item.getVolume();
        }
        System.out.println("logica para calcular frete com sedex");
        return (peso * volume) + (distancia * 0.1);
    }
    
}
