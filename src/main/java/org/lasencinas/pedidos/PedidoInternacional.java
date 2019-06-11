package org.lasencinas.pedidos;

import org.lasencinas.interfaces.Pedido;

public class PedidoInternacional implements Pedido {

    private String destino = null;
    private int peso = 0;

    public PedidoInternacional(String destino, int peso) {
        this.destino = destino;
        this.peso = peso;
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
