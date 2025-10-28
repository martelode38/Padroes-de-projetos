package data_mapper;

import dto.UserDTO;
import model.User;

/**
 * Classe responsável por converter entre objetos de domínio (User)
 * e objetos de transporte (UserDTO).
 */
public class Usermapper {

    // Converte de User (entidade) para UserDTO
    public static UserDTO toDTO(User user) {
        if (user == null) {
            return null;
        }
        return new UserDTO(user.getId(), user.getName(), user.getEmail());
    }

    // Converte de UserDTO para User (entidade)
    public static User toEntity(UserDTO dto, String password) {
        if (dto == null) {
            return null;
        }
        return new User(dto.getId(), dto.getName(), dto.getEmail(), password);
    }
}
