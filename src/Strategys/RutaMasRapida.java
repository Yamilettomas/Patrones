package Strategys;

public class RutaMasRapida implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Calculando la ruta más rápida...");
        System.out.println("Ruta más rápida encontrada");
        return "Ruta más rápida entre " + puntoA + " y " + puntoB;
    }
}