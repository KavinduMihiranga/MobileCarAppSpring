package lk.ijse.carMobileAppSpring.service;

import lk.ijse.carMobileAppSpring.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    void saveVehicle(VehicleDTO dto);
    void deleteVehicle(String vid);
    void updateVehicle(VehicleDTO dto);
    VehicleDTO searchVehicle(String vid);
    List<VehicleDTO> getAllVehicle();
}
