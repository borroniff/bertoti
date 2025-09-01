class LeitorEmail {
    private String email;
    public LeitorEmail(String email) { this.email = email; }
    public void enviarEmailComNoticia(String noticia) {
        System.out.println("Enviando email para " + email + " com a notícia: " + noticia);
    }
}

class LeitorSMS {
    private String telefone;
    public LeitorSMS(String telefone) { this.telefone = telefone; }
    public void enviarSMSComNoticia(String noticia) {
        System.out.println("Enviando SMS para " + telefone + " com a notícia: " + noticia);
    }
}

public class RevistaAntipadrao {
    private LeitorEmail leitorEmail;
    private LeitorSMS leitorSMS;
    private String ultimaEdicao;

    public void setLeitorEmail(LeitorEmail leitorEmail) {
        this.leitorEmail = leitorEmail;
    }

    public void setLeitorSMS(LeitorSMS leitorSMS) {
        this.leitorSMS = leitorSMS;
    }

    public void publicarNovaEdicao(String edicao) {
        this.ultimaEdicao = edicao;
        if (leitorEmail != null) {
            leitorEmail.enviarEmailComNoticia(ultimaEdicao);
        }
        if (leitorSMS != null) {
            leitorSMS.enviarSMSComNoticia(ultimaEdicao);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RevistaAntipadrao revista = new RevistaAntipadrao();
        revista.setLeitorEmail(new LeitorEmail("joao@email.com"));
        revista.setLeitorSMS(new LeitorSMS("99999-1234"));

        revista.publicarNovaEdicao("Edição de Outubro sobre Carros");
    }
}
