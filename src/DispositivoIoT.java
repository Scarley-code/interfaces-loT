public abstract class DispositivoIoT {
    private String id;
    private String ubicacion;
    private boolean encendido;

    public DispositivoIoT(String id, String ubicacion, boolean encendido) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.encendido = encendido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public abstract void procesarDatos();
}
