// Classe de uso

import Entity.Livro;
import Generator.RelatorioGenerator;
import Repository.LivroRepository;
import Service.NotificacaoService;
import Service.ValidacaoService;

public class App {
    public static void main(String[] args) {
        LivroRepository repository = new LivroRepository();
        RelatorioGenerator relatorio = new RelatorioGenerator();    
        NotificacaoService notificacao = new NotificacaoService();  
        ValidacaoService validacaoISBN = new ValidacaoService();  

        Livro livro = new Livro("Novo Livro", "Autor da Silva", "9999999999999");
        
        if(validacaoISBN.validarISBN(livro)) {
            // Persistência
            repository.salvarLivro(livro);
            repository.buscarPorISBN("1111111111111");

            // Relatório
            System.out.println(relatorio.gerarRelatorioLivro(livro));

            // Notificação            
            notificacao.enviarNotificacaoDisponibilidade(livro);
        } else {
            System.out.println("ISBN inválido!");
        }
    }
}