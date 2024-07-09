package Strategys;

public class RutaMasCorta implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Calculando ruta más corta...");
        System.out.println("Ruta más corta encontrada");
        return "Ruta más corta entre " + puntoA + " y " + puntoB;
    }
}