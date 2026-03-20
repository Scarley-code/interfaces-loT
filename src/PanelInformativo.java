public class PanelInformativo extends DispositivoloT implements ControlableRemotamente{
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

    }

    @Override
    public boolean concectarWifi() {
        return false;
    }

    @Override
    public void reiniciarDispositivo() {

    }
}
