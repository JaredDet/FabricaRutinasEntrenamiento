public abstract class Ejercicio {

    protected int nroRepeticiones;
    protected int nroSeries;

    protected Ejercicio(int nroRepeticiones, int nroSeries) {
        this.nroRepeticiones = nroRepeticiones;
        this.nroSeries = nroSeries;
    }

    protected abstract int getRepeticiones();

    protected abstract int getSeries();
}
