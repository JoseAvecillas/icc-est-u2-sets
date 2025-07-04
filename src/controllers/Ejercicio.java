package controllers;

import java.util.HashSet;
import java.util.Set;

import javax.sound.sampled.SourceDataLine;

public class Ejercicio {

    public Ejercicio() {
        System.out.println("Ejercicio 1");
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5}));
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45}));

        System.out.println("Ejercicio 2");
        System.out.println(esIsograma("Murcielago")); // true
        System.out.println(esIsograma("Camaleon"));   // false

        System.out.println("Ejercicio 3");
        String texto1 = "divertida cuando entienden en los se la conceptos";
        String texto2 = "puede ser pero reto también divertida ante aprender un";
        compararTextos(texto1, texto2);
    }

    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> vistos = new HashSet<>();
        for (int numero : numeros) {
            if (vistos.contains(numero)) {
                return true;
            }
            vistos.add(numero);
        }
        return false;
    }

    public boolean esIsograma(String palabra) {
        Set<Character> vistos = new HashSet<>();
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (vistos.contains(c)) {
                return false; // si se repite, no es isograma
            }
            vistos.add(c);
        }
        return true; // no hay letras repetidas
    }

    public int contarPalabrasUnicas(String frase) {
        return obtenerPalabrasUnicas(frase).size();
    }

    public void compararTextos(String texto1, String texto2) {
        Set<String> palabrasTexto1 = obtenerPalabrasUnicas(texto1);
        Set<String> palabrasTexto2 = obtenerPalabrasUnicas(texto2);

        Set<String> comunes = new HashSet<>(palabrasTexto1);
        comunes.retainAll(palabrasTexto2);

        Set<String> soloEnTexto1 = new HashSet<>(palabrasTexto1);
        soloEnTexto1.removeAll(palabrasTexto2);

        Set<String> soloEnTexto2 = new HashSet<>(palabrasTexto2);
        soloEnTexto2.removeAll(palabrasTexto1);

        int totalUnicas = palabrasTexto1.size() + palabrasTexto2.size();
        int comunesCount = comunes.size();

        double coincidenciaLexica = (comunesCount * 2.0 / totalUnicas) * 100;

        System.out.println("Texto 1: " + palabrasTexto1.size() + " palabras únicas");
        System.out.println("Texto 2: " + palabrasTexto2.size() + " palabras únicas");
        System.out.println("Cuantas Palabras comunes: " + comunesCount);
        System.out.printf("Coincidencia léxica: %.2f%%\n", coincidenciaLexica);
        System.out.println("Solo en texto 1: " + soloEnTexto1);
        System.out.println("Solo en texto 2: " + soloEnTexto2);
    }

    // Método auxiliar
    private Set<String> obtenerPalabrasUnicas(String frase) {
        Set<String> palabrasUnicas = new HashSet<>();
        StringBuilder palabraActual = new StringBuilder();

        frase = frase.toLowerCase().trim();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                palabraActual.append(c);
            } else {
                if (palabraActual.length() > 0) {
                    palabrasUnicas.add(palabraActual.toString());
                    palabraActual.setLength(0);
                }
            }
        }

        if (palabraActual.length() > 0) {
            palabrasUnicas.add(palabraActual.toString());
        }

        return palabrasUnicas;
    }
}
