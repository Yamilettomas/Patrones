package Strategys;

public class RutaMasTuristica implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Calculando la ruta más turística...");
        System.out.println("Ruta más turística encontrada");
        return "Ruta más turística entre " + puntoA + " y " + puntoB;
    }
}