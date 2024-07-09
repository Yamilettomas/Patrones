package Strategys;

public class RutaMasSegura implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Calculando la ruta más segura...");
        System.out.println("Ruta más segura encontrada");
        return "Ruta más segura entre " + puntoA + " y " + puntoB;
    }
}