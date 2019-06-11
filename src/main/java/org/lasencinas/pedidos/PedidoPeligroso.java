package org.lasencinas.pedidos;


import java.util.UUID;

public class PedidoPeligroso {

    public String destino = null;
    public String instruccion = null;
    public UUID uuid = null;

    public UUID getId() {
        return this.uuid;
    }
}
