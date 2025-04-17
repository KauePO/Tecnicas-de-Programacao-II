package Repository;
// Classe responsável por persistência dos livros

import Entity.Livro;

public class LivroRepository {
    public void salvarLivro(Livro livro) {
        // Simulação de persistência no banco de dados
        System.out.println("Salvando livro: " + livro.getTitulo());
    }

    public Livro buscarPorISBN(String isbn) {
        // Simulação de busca no banco de dados
        return new Livro("Livro Exemplo", "Autor Exemplo", isbn);
    }
}