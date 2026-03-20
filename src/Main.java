import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<DispositivoIoT> redDispositivos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Añadir un nuevo dispositivo");
            System.out.println("2. Mostrar estado de la red");
            System.out.println("3. Lanzar mantenimiento global");
            System.out.println("4. Reinicio remoto de emergencia");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("1. Semáforo");
                        System.out.println("2. Sensor");
                        System.out.println("3. Panel");
                        int tipo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("ID: ");
                        String id = sc.nextLine();

                        System.out.print("Ubicación: ");
                        String ubicacion = sc.nextLine();

                        switch (tipo) {
                            case 1:
                                System.out.print("Estado (Rojo/Ámbar/Verde): ");
                                String estado = sc.nextLine();
                                redDispositivos.add(new SemaforoInteligente(id, ubicacion, false, estado));
                                break;

                            case 2:
                                System.out.print("Nivel CO2: ");
                                double co2 = sc.nextDouble();
                                redDispositivos.add(new SensorContaminacion(id, ubicacion, false, co2));
                                break;

                            case 3:
                                sc.nextLine();
                                System.out.print("Texto: ");
                                String texto = sc.nextLine();
                                redDispositivos.add(new PanelInformativo(id, ubicacion, false, texto));
                                break;

                            default:
                                System.out.println("Tipo no válido");
                        }
                        break;

                    case 2:
                        if (redDispositivos.isEmpty()) {
                            System.out.println("No hay dispositivos en la red.");
                        } else {
                            for (DispositivoIoT d : redDispositivos) {
                                d.procesarDatos();
                            }
                        }
                        break;

                    case 3:
                        double total = 0;

                        for (DispositivoIoT d : redDispositivos) {
                            if (d instanceof Mantenible) {
                                Mantenible m = (Mantenible) d;

                                m.realizarMantenimiento();
                                total += m.calcularCosteMantenimiento();
                            }
                        }

                        System.out.println("Coste total mantenimiento: " + total + "€");
                        break;

                    case 4:
                        for (DispositivoIoT d : redDispositivos) {
                            if (d instanceof ControlableRemotamente) {
                                ControlableRemotamente c = (ControlableRemotamente) d;

                                if (c.conectarWifi()) {
                                    c.reiniciarDispositivo();
                                }
                            }
                        }
                        break;

                    case 0:
                        salir = true;
                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } else {
                System.out.println("Error: Debes ingresar un número.");
                sc.next();
            }
        } while (!salir);

        sc.close();
        System.out.println("Saliendo del sistema...");
    }
}