// Classe de uso
public class App {
    public static void main(String[] args) {
        Livro livro = new Livro("Novo Livro", "Autor da Silva", "9999999999999");
        
        if(livro.validarISBN(livro)) {
            // Persistência
            livro.salvarLivro(livro);

            // Relatório
            System.out.println(livro.gerarRelatorioLivro(livro));

            // Notificação            
            livro.enviarNotificacaoDisponibilidade(livro);
        } else {
            System.out.println("ISBN inválido!");
        }
    }
}