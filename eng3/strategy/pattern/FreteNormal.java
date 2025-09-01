public class FreteNormal implements CalculadoraFrete {
    @Override
    public double calcular(double peso) {
        return peso * 1.5;
    }
}
