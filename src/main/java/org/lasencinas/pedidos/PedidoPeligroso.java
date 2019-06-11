package org.lasencinas.pedidos;


import org.lasencinas.interfaces.Pedido;

import java.util.UUID;

public class PedidoPeligroso implements Pedido {

    public String destino = null;
    public String instruccion = null;
    public UUID uuid = null;

    public UUID getId() {
        return this.uuid;
    }

    @Override
    public String destino() {
        return this.destino;
    }

    @Override
    public int peso() {
        return 0;
    }
}
