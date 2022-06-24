import java.util.ArrayList;
import java.util.List;

public class RutinaPrincipiante implements Rutina {

    private List<Ejercicio> ejercicios;

    public RutinaPrincipiante() {
        ejercicios = new ArrayList<Ejercicio>();
        var flexiones = new Flexion(30, 2);
        var abdominales = new Abdominal(30, 2);
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