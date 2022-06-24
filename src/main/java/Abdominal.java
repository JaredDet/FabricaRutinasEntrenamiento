public class Abdominal extends Ejercicio {

    public Abdominal(int nroRepeticiones, int nroSeries) {
        super(nroRepeticiones, nroSeries);
    }

    @Override
    public int getRepeticiones() {
        return nroRepeticiones;
    }

    @Override
    public int getSeries() {
        return nroSeries;
    }

    @Override
    public String toString() {
        return "número de repeticiones: " + nroRepeticiones +
                "\nnúmero de series: " + nroSeries + "\n";
    }
}
