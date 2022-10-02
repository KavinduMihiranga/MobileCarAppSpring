package lk.ijse.carMobileAppSpring.repo;

import lk.ijse.carMobileAppSpring.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle, String> {
}
