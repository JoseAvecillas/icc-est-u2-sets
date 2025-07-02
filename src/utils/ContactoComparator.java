package utils;

import java.util.Comparator;



import models.*;

public class ContactoComparator implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        int cmpApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (cmpApellido != 0) return cmpApellido;

        int cmpNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if (cmpNombre != 0) return cmpNombre;

        return o1.getTelefono().compareTo(o2.getTelefono());
    }
}