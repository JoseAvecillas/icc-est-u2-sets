package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    

    public Sets() {
    }

    public Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");   
        palabras.add("Celular");  
        System.out.println("Tamaño HashSet: " + palabras.size());
        return palabras;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");  
        palabras.add("Celular"); 
        System.out.println("Tamaño LinkedHashSet: " + palabras.size());
        return palabras;
    }

    public Set<String> construirTreeSet() {
        Set<String> palabras = new TreeSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");  
        palabras.add("Celular"); 
        System.out.println("Tamaño LinkedHashSet: " + palabras.size());
        return palabras;
        
    }

    public Set<String> construirTreeSetConComparador() {
        // Implementacion de comparator para comparacion especifica 
        Comparator<String> comparador= new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                //Primero comparamos por la longitud
                int result= Integer.compare(s1.length(), s2.length());
                // Si son iguales en size, comparo alfabeticamente
                if (result == 0) {
                    return s1.compareTo(s2);
                }
                return result;
            }
        };

        Set<String> palabras = new TreeSet<>(comparador);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");  
        palabras.add("Celular");
        palabras.add("Celulas");
        System.out.println("Tamaño LinkedHashSet: " + palabras.size());
        return palabras;

    }

    public Set<String> construirTreeSetConComparadorInvertido() {
        // Implementacion de comparator para comparacion especifica 
        Comparator<String> comparador= new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                //Primero comparamos por la longitud
                int result= Integer.compare(s2.length(), s1.length());
                // Si son iguales en size, comparo alfabeticamente
                if (result == 0) {
                    return s2.compareTo(s1);
                }
                return result;
            }
        };

        Set<String> palabras = new TreeSet<>(comparador);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");  
        palabras.add("Celular");
        palabras.add("Celulas");
        System.out.println("Tamaño LinkedHashSet: " + palabras.size());
        return palabras;

    }

}