
public class Item {

    private int preco;
    private String nome;
    private double peso;
    private double volume;

    public Item(String nome, int preco, double peso, double volume) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.volume = volume;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}