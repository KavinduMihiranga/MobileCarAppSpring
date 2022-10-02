package lk.ijse.carMobileAppSpring.service.impl;

import lk.ijse.carMobileAppSpring.dto.VehicleDTO;
import lk.ijse.carMobileAppSpring.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {
    @Autowired

    @Override
    public void saveVehicle(VehicleDTO dto) {

    }

    @Override
    public void deleteVehicle(String vid) {

    }

    @Override
    public void updateVehicle(VehicleDTO dto) {

    }

    @Override
    public VehicleDTO searchVehicle(String vid) {
        return null;
    }

    @Override
    public List<VehicleDTO> getAllVehicle() {
        return null;
    }
}
