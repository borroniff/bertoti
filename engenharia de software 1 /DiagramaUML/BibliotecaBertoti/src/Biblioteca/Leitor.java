package Biblioteca;

public class Leitor {
        private String nome;
        private String email;

        public Leitor(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        // Getters e Setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void emprestarLivro(Livro livro) {
            livro.emprestar();
        }

        public void devolverLivro(Livro livro) {
            livro.devolver();
        }
    }
