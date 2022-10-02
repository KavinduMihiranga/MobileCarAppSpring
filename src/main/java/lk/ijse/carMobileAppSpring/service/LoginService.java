package lk.ijse.carMobileAppSpring.service;

import lk.ijse.carMobileAppSpring.dto.LoginDTO;

import java.util.List;

public interface LoginService {
    void saveLogin(LoginDTO dto);
    void deleteLogin(String lid);
    void updateLogin(LoginDTO dto);
    LoginDTO searchLogin(String lid);
    List<LoginDTO> getAllLogin();
}
