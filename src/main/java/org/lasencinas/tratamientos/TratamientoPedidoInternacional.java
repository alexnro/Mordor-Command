package org.lasencinas.tratamientos;

import org.lasencinas.interfaces.TratamientoPedido;
import org.lasencinas.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {

    private PedidoInternacional pedidoInternacional = null;

    public TratamientoPedidoInternacional(PedidoInternacional pedidoInternacional) {
        this.pedidoInternacional = pedidoInternacional;
    }

    @Override
    public boolean tratar() {
        return false;
    }
}
