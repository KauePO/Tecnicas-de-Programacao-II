// Classe responsável por representar um livro e suas regras básicas
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    // Getters e Setters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    public String gerarRelatorioLivro(Livro livro) {
        return "Relatório do Livro:\n" +
                "Título: " + livro.getTitulo() + "\n" +
                "Autor: " + livro.getAutor() + "\n" +
                "ISBN: " + livro.getIsbn() + "\n" +
                "Disponível: " + (livro.isDisponivel() ? "Sim" : "Não");
    }

    public void salvarLivro(Livro livro) {
        // Simulação de persistência no banco de dados
        System.out.println("Salvando livro: " + livro.getTitulo());
    }

    public Livro buscarPorISBN(String isbn) {
        // Simulação de busca no banco de dados
        return new Livro("Livro Exemplo", "Autor Exemplo", isbn);
    }

    public void enviarNotificacaoDisponibilidade(Livro livro) {
        String mensagem;

        if (livro.isDisponivel()){
            mensagem = "O livro '" + livro.getTitulo() + "' está disponível para empréstimo!";
        } else {
            mensagem = "O livro '" + livro.getTitulo() + "' NÃO está disponível para empréstimo!";
        }    

        System.out.println("Mensagem: " + mensagem);
    }

    public boolean validarISBN(Livro livro) {
        return livro.getIsbn() != null && livro.getIsbn().length() == 13;
    }

}