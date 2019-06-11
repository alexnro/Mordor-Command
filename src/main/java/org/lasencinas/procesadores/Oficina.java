package org.lasencinas.procesadores;

import org.lasencinas.interfaces.Procesador;
import org.lasencinas.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

    public boolean procesa(TratamientoPedido tratamientoPedido) {
        if (tratamientoPedido.tratar()) {
            return true;
        } else {
            return false;
        }
    }

}
