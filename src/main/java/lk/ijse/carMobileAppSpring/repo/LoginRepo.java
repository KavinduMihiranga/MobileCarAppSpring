package lk.ijse.carMobileAppSpring.repo;

import lk.ijse.carMobileAppSpring.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login, String> {
}
