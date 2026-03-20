public abstract class DispositivoloT {
    private String id;
    private String ubicacion;
    private boolean encendido;

    public DispositivoloT(String id, String ubicacion, boolean encendido) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.encendido = false;
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
