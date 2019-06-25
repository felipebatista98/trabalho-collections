package model;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private float preco;
    private int codigoProduto;
    private ArrayList<Pedido> listaPedido;
    
    public Produto(String nome, float preco, int codigoProduto) {
        this.nome = nome;
        this.preco = preco;
        this.codigoProduto = codigoProduto;
        this.listaPedido = new ArrayList<Pedido>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public ArrayList<Pedido> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(ArrayList<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    public void addPedido(Pedido Pedido) {
        listaPedido.add(Pedido);
    }

    public void removePedido(Pedido exPedido) {
        listaPedido.remove(exPedido);
    }
}
