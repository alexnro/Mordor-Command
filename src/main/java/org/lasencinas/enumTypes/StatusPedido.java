package org.lasencinas.enumTypes;

public enum  StatusPedido {

    ACEPTADO ("ACEPTADO"),
    RECHAZADO ("RECHAZADO");

    private String status = null;

    private StatusPedido(String status) {
        this.status = status;
    }
}
