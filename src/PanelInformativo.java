public class PanelInformativo extends DispositivoIoT implements ControlableRemotamente{
    private String textoMostrado;

    public PanelInformativo(String id, String ubicacion, boolean encendido, String textoMostrado) {
        super(id, ubicacion, encendido);
        this.textoMostrado = textoMostrado;
    }

    public String getTextoMostrado() {
        return textoMostrado;
    }

    public void setTextoMostrado(String textoMostrado) {
        this.textoMostrado = textoMostrado;
    }

    @Override
    public void procesarDatos() {
        System.out.println("Panel en " + getUbicacion() + ": " + textoMostrado);
    }

    @Override
    public boolean conectarWifi() {
        System.out.println("Panel conectado a la red WiFi");
        return true;
    }

    @Override
    public void reiniciarDispositivo() {
        System.out.println("Panel reiniciado");
    }
}
