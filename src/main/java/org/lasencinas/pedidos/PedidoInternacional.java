package org.lasencinas.pedidos;

import org.lasencinas.interfaces.Pedido;

import java.util.UUID;

public class PedidoInternacional implements Pedido {

    private String destino = null;
    private int peso = 0;
    private UUID uuid = null;

    public PedidoInternacional(String destino, int peso) {
        this.destino = destino;
        this.peso = peso;
        this.uuid = UUID.randomUUID();
    }

    @Override
    public int peso() {
        return 0;
    }

    @Override
    public String destino() {
        return this.destino;
    }

    public UUID getId() {
        return this.uuid;
    }
}
