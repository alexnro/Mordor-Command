package org.lasencinas.pedidos;

import org.lasencinas.interfaces.Pedido;

import java.util.UUID;

public class PedidoNacional implements Pedido {

    private int peso = 0;
    private String destino = null;
    private UUID uuid = null;

    public PedidoNacional(String destino, int peso) {
        this.peso = peso;
        this.destino = destino;
        this.uuid = UUID.randomUUID();
    }

    @Override
    public int peso () {
        return this.peso;
    }

    @Override
    public String destino() {
        return this.destino;
    }

    public UUID getId() {
        return this.uuid;
    }
}
