package org.lasencinas.tratamientos;

import org.lasencinas.interfaces.Pedido;
import org.lasencinas.interfaces.TratamientoPedido;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TratamientoPedidoMultiple implements TratamientoPedido {

    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private int bultos = 0;
    private int pesoTotal = 0;

    public TratamientoPedidoMultiple(ArrayList pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }

    @Override
    public boolean tratar() {
        if ((getPesoTotal() > 0) && (getNumBultos() == getPedidos().size())) {
            return true;
        } else {
            return false;
        }
    }

    public void calcularTotalBultos() {
        getPedidos()
                .stream()
                .filter(pedido -> {
                    this.bultos ++;
                    return true;
                }).collect(Collectors.toList());
    }

    public void calcularPesoTotal() {
        getPedidos()
                .stream()
                .filter(pedido -> {
                    this.pesoTotal += pedido.peso();
                    return true;
                })
                .collect(Collectors.toList());
    }

    public int getNumBultos() {
        return this.bultos;
    }

    public int getPesoTotal() {
        return this.pesoTotal;
    }

}
