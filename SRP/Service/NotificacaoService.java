package Service;
// Classe responsável por notificações

import Entity.Livro;

public class NotificacaoService {
    public void enviarNotificacaoDisponibilidade(Livro livro) {
        String mensagem;

        if (livro.isDisponivel()){
            mensagem = "O livro '" + livro.getTitulo() + "' está disponível para empréstimo!";
        } else {
            mensagem = "O livro '" + livro.getTitulo() + "' NÃO está disponível para empréstimo!";
        }    

        System.out.println("Mensagem: " + mensagem);
    }
}