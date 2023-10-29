import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> items = new ArrayList<>();
    double distancia;
    FreteStrategy freteStrategy;

    public void adicionaItem(Item item) {
        items.add(item);

    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int calculaTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPreco();
        }
        sum += this.calculaFrete(this.freteStrategy, this.distancia);
        return sum;
    }

    public void realizaPagamento(PagamentoStrategy strategy) {
        int total = this.calculaTotal();
        strategy.pagar(total);

    }

    public double calculaFrete(FreteStrategy strategy, double distancia) {
        return strategy.calcularFrete(this.items, distancia);
    }

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

}