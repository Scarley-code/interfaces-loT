public class SemaforoInteligente extends DispositivoloT implements Mantenible, ControlableRemotamente{
    private String estadoActual;

    public SemaforoInteligente(String id, String ubicacion, boolean encendido, String estadoActual) {
        super(id, ubicacion, encendido);
        this.estadoActual = estadoActual;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    @Override
    public void procesarDatos() {

    }

    @Override
    public boolean concectarWifi() {
        return false;
    }

    @Override
    public void reiniciarDispositivo() {

    }

    @Override
    public double calcularCosteMantenimiento() {
        return 150.0;
    }

    @Override
    public void realizarMantenimiento() {

    }
}
