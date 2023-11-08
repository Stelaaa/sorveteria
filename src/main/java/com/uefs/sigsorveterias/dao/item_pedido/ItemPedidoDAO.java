package com.uefs.sigsorveterias.dao.item_pedido;

import com.uefs.sigsorveterias.dao.CRUD;
import com.uefs.sigsorveterias.model.ItemPedido;
import com.uefs.sigsorveterias.model.Pedido;

import java.util.List;

public interface ItemPedidoDAO extends CRUD<ItemPedido, Exception> {

    /**
     * Retorna todos os itens de um produto
     *
     * @param pedido
     * @return
     */
    public List<ItemPedido> findManyByPedido(Pedido pedido);


    /**
     * Remove todos os itens de um pedido
     *
     * @param pedido
     */
    public void deleteMany(Pedido pedido);

}
