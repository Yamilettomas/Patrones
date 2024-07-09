package Strategys;

public class RutaMasEconomica implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Calculando ruta más económica...");
        System.out.println("Ruta más económica encontrada");
        return "Ruta más económica entre " + puntoA + " y " + puntoB;
    }
}