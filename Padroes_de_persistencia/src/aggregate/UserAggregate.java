package aggregate;

import model.User;

/**
 * Representa o agregado do domínio "User".
 * Garante que as regras de consistência (invariantes) sejam mantidas.
 */
public class UserAggregate {
    private final User user;

    public UserAggregate(User user) {
        if (user == null) {
            throw new IllegalArgumentException("Usuário não pode ser nulo.");
        }
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            throw new IllegalArgumentException("E-mail inválido.");
        }
        if (user.getPassword() == null || user.getPassword().length() < 6) {
            throw new IllegalArgumentException("A senha deve ter pelo menos 6 caracteres.");
        }

        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "UserAggregate{" + "user=" + user + '}';
    }
}
