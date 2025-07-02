package controllers;
import models.*;
import java.util.*;
import utils.*;

public class ContactoController {

    public ContactoController(){
        runTreeContacto();
        runTreeContactoTelefono();
        runTreeHash();
    }

    public void runTreeContacto(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez","222222222"));

        System.out.println("Agenda ordenada por nombre y apellido:");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }

    public void runTreeContactoTelefono(){
        Set<Contacto> agenda = new TreeSet<>(new ContactorComparatorHash()); 
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez","222222222"));

        System.out.println("Impreso por Agenda-Telefono y nombre:");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }

    public void runTreeHash(){
        Set<Contacto> agenda = new TreeSet<>(new ContactorComparatorHash());  
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez","222222222"));

        System.out.println("Agenda ordenada por Telefono, Nombre y Apellido (sin duplicados):");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
}