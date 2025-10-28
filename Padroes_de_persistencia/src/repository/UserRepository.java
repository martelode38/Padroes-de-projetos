
package repository;

import java.util.List;
import java.util.Optional;
import model.User;

/**
 * Interface do padrão Repository (DDD).
 * Trabalha com agregados, garantindo consistência do domínio.
 */

public interface UserRepository {
    void save(User user);
    Optional<User> findById(Integer id);
    List<User> findAll();
    void delete(Integer id);
}
