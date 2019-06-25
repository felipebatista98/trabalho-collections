package model;

public class ItemPedido {
    private int qtd;
    private float valor;
    private Produto produto;
    private Pedido pedido;
    
    public ItemPedido(int qtd, float valor, Produto produto, Pedido pedido) {
        this.qtd = qtd;
        this.valor = valor;
        this.produto = produto;
        this.pedido = pedido;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
