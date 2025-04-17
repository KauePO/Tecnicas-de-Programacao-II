package Service;
import Entity.Livro;

public class ValidacaoService {
    // Validação básica do ISBN
    public boolean validarISBN(Livro livro) {
        return livro.getIsbn() != null && livro.getIsbn().length() == 13;
    }
}
