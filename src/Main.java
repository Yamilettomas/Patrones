import Strategys.*;

public class Main {
    public static void main(String[] args) {

        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("Punto A", "Punto B");

        System.out.println();

        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("Punto A", "Punto B");

        System.out.println();

        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Punto A", "Punto B");

        System.out.println();

        gps.setRutaStrategy(new RutaMasTuristica());
        gps.calcularRuta("Punto A", "Punto B");

        System.out.println();

        gps.setRutaStrategy(new RutaMasSegura());
        gps.calcularRuta("Punto A", "Punto B");

    }
}