import java.util.ArrayList;
import java.util.List;

public class RutinaIntermedia implements Rutina {

    private List<Ejercicio> ejercicios;

    public RutinaIntermedia() {
        ejercicios = new ArrayList<Ejercicio>();
        var flexiones = new Flexion(30, 3);
        var abdominales = new Abdominal(40, 3);
        ejercicios.add(flexiones);
        ejercicios.add(abdominales);
    }

    @Override
    public List<Ejercicio> getRutina() {
        return ejercicios;
    }

    @Override
    public String toString() {
        var lista = new StringBuilder();
        ejercicios.forEach(lista::append);
        return lista.toString();
    }
}
