public class Leitor implements Assinante {
    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberNoticia(String noticia) {
        System.out.println(nome + " recebeu a nova edição: " + noticia);
    }
}
