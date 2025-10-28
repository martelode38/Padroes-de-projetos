import model.User;
import repository.UserRepository;
import repository.UserRepositoryImpl;

public class MainTestRepository {
    public static void main(String[] args) {
        UserRepository userRepo = new UserRepositoryImpl();

        User u1 = new User(null, "Marcos", "marcos@email.com", "123");
        User u2 = new User(null, "Ana", "ana@email.com", "456");

        userRepo.save(u1);
        userRepo.save(u2);

        System.out.println("\nTodos os usuários:");
        userRepo.findAll().forEach(System.out::println);

        System.out.println("\nBuscando ID 1:");
        userRepo.findById(1).ifPresent(System.out::println);

        userRepo.delete(2);
        System.out.println("\nApós remover Ana:");
        userRepo.findAll().forEach(System.out::println);
    }
}
