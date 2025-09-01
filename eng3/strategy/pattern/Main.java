public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        
        pedido.setCalculadoraFrete(new FreteNormal());
        System.out.println("Frete Normal: R$ " + pedido.calcularFrete(10));

        pedido.setCalculadoraFrete(new FreteExpresso());
        System.out.println("Frete Expresso: R$ " + pedido.calcularFrete(10));
    }
}
