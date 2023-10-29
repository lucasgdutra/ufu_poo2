import java.util.List;

public class NormalFrete implements FreteStrategy {

    @Override
    public double calcularFrete(List<Item> items, double distancia) {
        double peso = 0;
        double volume = 0;
        for (Item item : items) {
            peso += item.getPeso();
            volume += item.getVolume();
        }
        System.out.println("logica para calcular frete normal");
        return (peso * volume) + (distancia * 0.05);
    }

}
