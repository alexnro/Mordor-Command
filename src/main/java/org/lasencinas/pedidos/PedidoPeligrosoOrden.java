package org.lasencinas.pedidos;

import org.lasencinas.interfaces.Pedido;

import java.util.UUID;

public class PedidoPeligrosoOrden extends PedidoPeligroso implements Pedido {

    public PedidoPeligrosoOrden(String destino, String instruccion) {
        this.destino = destino;
        this.instruccion = instruccion;
        super.uuid = UUID.randomUUID();
    }

    @Override
    public int peso() {
        return 0;
    }

    @Override
    public String destino() {
        return this.destino;
    }
}
