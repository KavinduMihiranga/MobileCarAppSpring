package lk.ijse.carMobileAppSpring.service;

import lk.ijse.carMobileAppSpring.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO dto);
    void deleteUser(String uid);
    void updateUser(UserDTO dto);
    UserDTO searchUser(String uid);
    List<UserDTO> getAllUser();
}
