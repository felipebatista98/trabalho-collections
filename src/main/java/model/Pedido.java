package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Pedido {
    private int codigoPedido;
    private String dataPedido;
    private String dataEntrega;
    private ArrayList<Produto> listaProduto;
    
    public Pedido(int codigoPedido, String dtEntrega) {
        this.codigoPedido = codigoPedido;
        this.dataEntrega = dtEntrega;
        this.listaProduto = new ArrayList<Produto>();
        
        Calendar cal = Calendar.getInstance();
        
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH)+1;
        int ano = cal.get(Calendar.YEAR);
        
        dataPedido = dia + "/" + mes + "/" + ano;
    }
    
    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public ArrayList<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(ArrayList<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
    
    public void addProduto(Produto novoProduto) {
        listaProduto.add(novoProduto);
    }
    
    public void removeProduto(Produto exProduto) {
        if (!listaProduto.contains(exProduto))
            return;
        else
            listaProduto.remove(exProduto);
    }
}
