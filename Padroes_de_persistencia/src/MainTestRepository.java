import aggregate.UserAggregate;
import model.User;
import repository.UserRepository;
import repository.UserRepositoryImpl;

public class MainTestRepository {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();

        // cria e salva um usuário válido
        try {
            User validUser = new User(null, "Marcos", "marcos@email.com", "123456");
            UserAggregate aggregate = new UserAggregate(validUser);
            userRepository.save(aggregate.getUser());
            System.out.println("Usuário válido salvo com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao salvar usuário válido: " + e.getMessage());
        }

        // tentar criar usuário com e-mail inválido 
        try {
            User invalidEmailUser = new User(null, "João", "joaoemail.com", "654321");
            UserAggregate aggregate = new UserAggregate(invalidEmailUser);
            userRepository.save(aggregate.getUser());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        //  tentar criar usuário com senha curta
        try {
            User shortPasswordUser = new User(null, "Ana", "ana@email.com", "123");
            UserAggregate aggregate = new UserAggregate(shortPasswordUser);
            userRepository.save(aggregate.getUser());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        // listar todos os usuários válidos
        System.out.println("\nUsuários salvos:");
        userRepository.findAll().forEach(System.out::println);
    }
}
