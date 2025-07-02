package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparatorTelefono implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        int comparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (comparacionApellido != 0) {
            return comparacionApellido;
        }

        int comparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if (comparacionNombre != 0) {
            return comparacionNombre;
        }

        return o1.getTelefono().compareTo(o2.getTelefono());
    }
}