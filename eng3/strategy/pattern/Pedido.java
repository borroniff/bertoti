public class Pedido {
    private CalculadoraFrete calculadoraFrete;

    public void setCalculadoraFrete(CalculadoraFrete calculadoraFrete) {
        this.calculadoraFrete = calculadoraFrete;
    }

    public double calcularFrete(double peso) {
        return calculadoraFrete.calcular(peso);
    }
}
