public class PedidoAntipadrao {
    public double calcularFrete(String tipoFrete, double peso) {
        if ("normal".equals(tipoFrete)) {
            return peso * 1.5;
        } else if ("expresso".equals(tipoFrete)) {
            return peso * 3.0;
        } else if ("transportadora".equals(tipoFrete)) {
            return peso * 2.5 + 10;
        } else {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PedidoAntipadrao pedido = new PedidoAntipadrao();
        System.out.println("Frete Normal: R$ " + pedido.calcularFrete("normal", 10));
        System.out.println("Frete Expresso: R$ " + pedido.calcularFrete("expresso", 10));
    }
}
