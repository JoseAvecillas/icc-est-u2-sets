package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactorComparatorHash implements Comparator<Contacto> {
    @Override
    public int compare(Contacto o1, Contacto o2) {
        int cmp = Integer.compare(o1.hashCode(), o2.hashCode());
        if (cmp == 0) {
            cmp = o1.getNombre().compareTo(o2.getNombre());
            if (cmp == 0) cmp = o1.getApellido().compareTo(o2.getApellido());
            if (cmp == 0) cmp = o1.getTelefono().compareTo(o2.getTelefono());
        }
        return cmp;
    }
}