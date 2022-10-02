package lk.ijse.carMobileAppSpring.service.impl;

import lk.ijse.carMobileAppSpring.dto.LoginDTO;
import lk.ijse.carMobileAppSpring.dto.UserDTO;
import lk.ijse.carMobileAppSpring.entity.Login;
import lk.ijse.carMobileAppSpring.entity.User;
import lk.ijse.carMobileAppSpring.repo.LoginRepo;
import lk.ijse.carMobileAppSpring.service.LoginService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepo loginRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveLogin(LoginDTO dto) {
        if (!loginRepo.existsById(dto.getLid())){
            loginRepo.save(mapper.map(dto, Login.class));
        }else {
            throw new RuntimeException("Login Already Exist..!");
        }
    }

    @Override
    public void deleteLogin(String lid) {
        if (loginRepo.existsById(lid)){
            loginRepo.deleteById(lid);
        }else {
            throw new RuntimeException("Please check the Login ID.. No Such Login..!");
        }
    }

    @Override
    public void updateLogin(LoginDTO dto) {
        if (loginRepo.existsById(dto.getLid())){
            loginRepo.save(mapper.map(dto,Login.class));
        }else {
            throw new RuntimeException("No Such Login To Update..! Please Check the ID..!");
        }
    }

    @Override
    public LoginDTO searchLogin(String lid) {
        if (loginRepo.existsById(lid)){
            return mapper.map(loginRepo.findById(lid).get(), LoginDTO.class);
        }else {
            throw new RuntimeException("No Login For " + lid + " ..!");
        }
    }

    @Override
    public List<LoginDTO> getAllLogin() {
        return mapper.map(loginRepo.findAll(),new TypeToken<List<LoginDTO>>(){}.getType());
    }
}
