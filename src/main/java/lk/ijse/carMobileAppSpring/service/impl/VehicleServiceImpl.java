package lk.ijse.carMobileAppSpring.service.impl;

import lk.ijse.carMobileAppSpring.dto.UserDTO;
import lk.ijse.carMobileAppSpring.dto.VehicleDTO;
import lk.ijse.carMobileAppSpring.entity.User;
import lk.ijse.carMobileAppSpring.entity.Vehicle;
import lk.ijse.carMobileAppSpring.repo.VehicleRepo;
import lk.ijse.carMobileAppSpring.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepo vehicleRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveVehicle(VehicleDTO dto) {
        if (!vehicleRepo.existsById(dto.getVid())){
            vehicleRepo.save(mapper.map(dto, Vehicle.class));
        }else {
            throw new RuntimeException("Vehicle Already Exist..!");
        }
    }

    @Override
    public void deleteVehicle(String vid) {
        if (vehicleRepo.existsById(vid)){
            vehicleRepo.deleteById(vid);
        }else {
            throw new RuntimeException("Please check the Vehicle ID.. No Such Vehicle..!");
        }
    }

    @Override
    public void updateVehicle(VehicleDTO dto) {
        if (vehicleRepo.existsById(dto.getVid())){
            vehicleRepo.save(mapper.map(dto,Vehicle.class));
        }else {
            throw new RuntimeException("No Such Vehicle To Update..! Please Check the ID..!");
        }
    }

    @Override
    public VehicleDTO searchVehicle(String vid) {
        if (vehicleRepo.existsById(vid)){
            return mapper.map(vehicleRepo.findById(vid).get(), VehicleDTO.class);
        }else {
            throw new RuntimeException("No Vehicle For " + vid + " ..!");
        }
    }

    @Override
    public List<VehicleDTO> getAllVehicle() {
        return mapper.map(vehicleRepo.findAll(),new TypeToken<List<VehicleDTO>>(){}.getType());
    }
}
