import java.util.ArrayList;
import java.util.List;

public class RutinaAvanzada implements Rutina {

    private List<Ejercicio> ejercicios;

    public RutinaAvanzada() {
        ejercicios = new ArrayList<Ejercicio>();
        var flexiones = new Flexion(50, 4);
        var abdominales = new Abdominal(60, 4);
        var dominadas = new Dominada(15, 3);
        ejercicios.add(flexiones);
        ejercicios.add(abdominales);
        ejercicios.add(dominadas);
    }

    @Override
    public List<Ejercicio> getRutina() {
        return ejercicios;
    }

    @Override
    public String toString() {
        var lista = new StringBuilder();
        lista.append("Su rutina es: \n\n");
        ejercicios.forEach(lista::append);
        return lista.toString();
    }
}
