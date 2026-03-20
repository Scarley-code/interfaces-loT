public class SemaforoInteligente extends DispositivoIoT implements Mantenible, ControlableRemotamente{
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
        System.out.println("El semáforo está en " + getUbicacion() + " y está en " + estadoActual);
    }

    @Override
    public boolean conectarWifi() {
        System.out.println("Semáforo conectado a la red WiFi");
        return true;
    }

    @Override
    public void reiniciarDispositivo() {
        System.out.println("Semáforo reiniciado");
    }

    @Override
    public double calcularCosteMantenimiento() {
        return 150.0;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Mantenimiento del semáforo realizado");
    }
}
