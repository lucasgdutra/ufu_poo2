package lab7;

import java.util.List;

public abstract class PedidoLojaTemplate {
    private CanalVendas canalVendas;
    private TipoPagamento tipoPagamento;
    private List<Item> itens;
    private double valorTotal;

    public PedidoLojaTemplate(CanalVendas canalVendas, TipoPagamento tipoPagamento, List<Item> itens) {
        this.canalVendas = canalVendas;
        this.tipoPagamento = tipoPagamento;
        this.itens = itens;
        for (Item item : itens) {
            this.valorTotal += item.getValor();
        }
    }

    public abstract void processarPagamento();

    public boolean entregar() {
        return true;
    }

    public CanalVendas getCanalVendas() {
        return canalVendas;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public List<Item> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        
        this.valorTotal = valorTotal;
    }

}
