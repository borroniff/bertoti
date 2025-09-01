public class Main {
    public static void main(String[] args) {
        Revista revista = new Revista();

        Leitor leitor1 = new Leitor("João");
        Leitor leitor2 = new Leitor("Maria");

        revista.registrarAssinante(leitor1);
        revista.registrarAssinante(leitor2);

        revista.publicarNovaEdicao("Edição de Setembro sobre IA");
    }
}
