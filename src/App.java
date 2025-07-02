import java.util.Set;
import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Sets sets = new Sets();

        System.out.println("\n--- Usando HashSet ---");
        runHashSet(sets);
        System.out.println("\n--- Usando LinkedHashSet ---");
        runLinkedHashSet(sets);
        System.out.println("\n--- Usando TreeSet ---");
        runTreeSet(sets);
        System.out.println("\n--- Usando TreeSet con comparador ---");
        runTreeSetConComparador(sets);
        System.out.println("\n--- Usando TreeSet con comparador Invertido ---");
        runTreeSetConComparadorInvertido(sets);
    }

    public static void runHashSet(Sets setDado) {
        Set<String> setRecibido = setDado.construirHashSet(); 
        for (String palabra : setRecibido) {
            System.out.println(palabra);
        }
        System.out.println("----------------------------------");
    }

    public static void runLinkedHashSet(Sets setDado) {
        Set<String> setRecibido = setDado.construirLinkedHashSet(); 
        for (String palabra : setRecibido) {
            System.out.println(palabra);
        }
        System.out.println("----------------------------------");
    }

    public static void runTreeSet(Sets setDado) {
        Set<String> setRecibido = setDado.construirTreeSet(); 
        for (String palabra : setRecibido) {
            System.out.println(palabra);
        }
        System.out.println("----------------------------------");
    }

    public static void runTreeSetConComparador(Sets setDado) {
        Set<String> setRecibido = setDado.construirTreeSetConComparador(); 
        for (String palabra : setRecibido) {
            System.out.println(palabra);
        }
        System.out.println("----------------------------------");
    }

    public static void runTreeSetConComparadorInvertido(Sets setDado) {
        Set<String> setRecibido = setDado.construirTreeSetConComparadorInvertido(); 
        for (String palabra : setRecibido) {
            System.out.println(palabra);
        }
        System.out.println("----------------------------------");
    }
}