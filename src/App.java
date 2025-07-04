import java.util.Set;
import controllers.Sets;
import controllers.ContactoController;
import controllers.Ejercicio;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Sets sets = new Sets();
        System.out.println("----------------------------------------------------");
        //System.out.println("Agenda ordenada por apellido y nombre");
        //ContactoController contacto = new ContactoController();

        String texto = """
                    La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
                    Por otro lado, la IA puede ser una herramienta poderosa en sectores variados tales como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
                    En resumen, el desarrollo responsable de la inteligencia artificial porque no solo cuenta con eso ademas debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";

        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        Ejercicio ejercicio = new Ejercicio();
        System.out.println(ejercicio.contarPalabrasUnicas(texto));
        System.out.println(ejercicio.contarPalabrasUnicas(texto1));
        System.out.println(ejercicio.contarPalabrasUnicas(texto2));

        ejercicio.compararTextos(texto1, texto2);
        // System.out.println("\n--- Usando HashSet ---");
        // runHashSet(sets);
        // System.out.println("\n--- Usando LinkedHashSet ---");
        // runLinkedHashSet(sets);
        // System.out.println("\n--- Usando TreeSet ---");
        // runTreeSet(sets);
        // System.out.println("\n--- Usando TreeSet con comparador ---");
        // runTreeSetConComparador(sets);
        // System.out.println("\n--- Usando TreeSet con comparador Invertido ---");
        // runTreeSetConComparadorInvertido(sets);
        


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