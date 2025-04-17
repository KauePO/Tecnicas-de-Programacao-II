package Generator;
// Classe responsável por geração de relatórios

import Entity.Livro;

public class RelatorioGenerator {
    public String gerarRelatorioLivro(Livro livro) {
        return "Relatório do Livro:\n" +
               "Título: " + livro.getTitulo() + "\n" +
               "Autor: " + livro.getAutor() + "\n" +
               "ISBN: " + livro.getIsbn() + "\n" +
               "Disponível: " + (livro.isDisponivel() ? "Sim" : "Não");
    }
}