package org.lasencinas.tratamientos;

import org.lasencinas.interfaces.TratamientoPedido;
import org.lasencinas.pedidos.PedidoPeligroso;

public class TratamientoPedidoPeligroso extends PedidoPeligroso implements TratamientoPedido {

    private PedidoPeligroso pedidoPeligroso = null;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedidoPeligroso) {
        this.pedidoPeligroso = pedidoPeligroso;
    }

    public PedidoPeligroso getPedidoPeligroso() {
        return this.pedidoPeligroso;
    }

    @Override
    public boolean tratar() {
        if (getPedidoPeligroso().instruccion.equals("no ponerselo en el dedo")) {
            return false;
        } else {
            return true;
        }
    }
}
