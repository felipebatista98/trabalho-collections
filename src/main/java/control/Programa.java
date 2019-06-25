package control;

import org.apache.commons.collections4.map.MultiKeyMap;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class Programa {

    public static void main(String[] args) {
        
        MultiKeyMap itensPedidos = new MultiKeyMap();
       
        //Produtos
        
        Produto prod1 = new Produto("iPhone Xs", (float) 6000.0, 2);
        Produto prod2 = new Produto("MacBook Pro", (float) 10000.0, 1);
        
        //Pedidos
        
        Pedido ped1 = new Pedido(1, "2/7/2019");
        
        prod1.addPedido(ped1);
        prod2.addPedido(ped1);
        ped1.addProduto(prod1);
        ped1.addProduto(prod2);
        
        //Itens pedidos
        
        ItemPedido itemPed1 = new ItemPedido(2, 2 * prod1.getPreco(),prod1, ped1);
        ItemPedido itemPed2 = new ItemPedido(1, 1 * prod2.getPreco(), prod2, ped1);
        
        itensPedidos.put(ped1, prod1, "Pedido " + ped1 + " com o produto " + prod1.getNome());
        itensPedidos.put(ped1, prod2, "Pedido " + ped1 + " com o produto " + prod2.getNome());
        
        System.out.println("***** Lista de Pedidos *****");
        System.out.println("codigo: " + ped1.getCodigoPedido());
        System.out.println("Data do Pedido: " + ped1.getDataPedido());
        System.out.println("Data da Entrega: " + ped1.getDataEntrega());
        
        int i = 1;
        
        for (Produto prodTemp : ped1.getListaProduto()) {
            System.out.println("Produto Pedido: " + prodTemp.getNome());
            System.out.println("Preço Unitário: R$ " + prodTemp.getPreco());
            if(i==1)
                System.out.println("Quantidade: " + itemPed1.getQtd());
            else
                System.out.println("Quantidade: " + itemPed2.getQtd());
            
            i++;       
        }
        float valorTotal = itemPed1.getValor() + itemPed2.getValor();
        System.out.println("Valor Total: R$ " + valorTotal);
    }

}
