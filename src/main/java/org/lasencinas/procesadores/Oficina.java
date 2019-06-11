package org.lasencinas.procesadores;

import org.lasencinas.enumTypes.StatusPedido;
import org.lasencinas.interfaces.Pedido;
import org.lasencinas.interfaces.Procesador;
import org.lasencinas.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

    @Override
    public boolean procesa(TratamientoPedido tratamientoPedido) {
        return tratamientoPedido.tratar();
    }

    public String printarStatus(boolean procesa, Pedido pedido) {
        if (procesa) {
            return pedido.destino() + ' ' + StatusPedido.ACEPTADO;
        } else {
            return pedido.destino() + ' ' + StatusPedido.RECHAZADO;
        }
    }

}
