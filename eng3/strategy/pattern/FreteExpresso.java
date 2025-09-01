public class FreteExpresso implements CalculadoraFrete {
    @Override
    public double calcular(double peso) {
        return peso * 3.0;
    }
}
