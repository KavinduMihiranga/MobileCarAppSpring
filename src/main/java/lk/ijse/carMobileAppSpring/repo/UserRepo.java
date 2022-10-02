package lk.ijse.carMobileAppSpring.repo;

import lk.ijse.carMobileAppSpring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
