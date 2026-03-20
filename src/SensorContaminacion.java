public class SensorContaminacion extends DispositivoloT implements Mantenible{
    private double nivelCO2;

    public SensorContaminacion(String id, String ubicacion, boolean encendido, double nivelCO2) {
        super(id, ubicacion, encendido);
        this.nivelCO2 = nivelCO2;
    }

    public double getNivelCO2() {
        return nivelCO2;
    }

    public void setNivelCO2(double nivelCO2) {
        this.nivelCO2 = nivelCO2;
    }

    @Override
    public void procesarDatos() {

    }

    @Override
    public double calcularCosteMantenimiento() {
        return 50.;
    }

    @Override
    public void realizarMantenimiento() {

    }
}
