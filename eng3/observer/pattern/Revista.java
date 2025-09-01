import java.util.ArrayList;
import java.util.List;

public class Revista {
    private List<Assinante> assinantes = new ArrayList<>();
    private String ultimaEdicao;

    public void registrarAssinante(Assinante assinante) {
        assinantes.add(assinante);
    }

    public void removerAssinante(Assinante assinante) {
        assinantes.remove(assinante);
    }

    public void notificarAssinantes() {
        for (Assinante assinante : assinantes) {
            assinante.receberNoticia(ultimaEdicao);
        }
    }

    public void publicarNovaEdicao(String edicao) {
        this.ultimaEdicao = edicao;
        notificarAssinantes();
    }
}
