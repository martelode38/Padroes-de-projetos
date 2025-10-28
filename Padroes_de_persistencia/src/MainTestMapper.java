
import model.User;
import data_mapper.Usermapper;
import dto.UserDTO;

public class MainTestMapper {
    public static void main(String[] args) {
        User user = new User(1, "Marcos", "marcos@email.com", "12345");

        // Entidade → DTO
        UserDTO dto = Usermapper.toDTO(user);
        System.out.println("Convertido para DTO: " + dto);

        // DTO → Entidade (senha vem de fora)
        User user2 = Usermapper.toEntity(dto, "12345");
        System.out.println("Convertido de volta para User: " + user2);
    }
}
