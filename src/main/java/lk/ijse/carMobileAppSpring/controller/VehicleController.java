package lk.ijse.carMobileAppSpring.controller;

import lk.ijse.carMobileAppSpring.dto.UserDTO;
import lk.ijse.carMobileAppSpring.dto.VehicleDTO;
import lk.ijse.carMobileAppSpring.repo.VehicleRepo;
import lk.ijse.carMobileAppSpring.service.VehicleService;
import lk.ijse.carMobileAppSpring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/vehicle")
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllVehicle() {
        return new ResponseUtil(200,"Ok",vehicleService.getAllVehicle());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveVehicle(@RequestBody VehicleDTO vehicleDTO) {
        vehicleService.saveVehicle(vehicleDTO);
        return new ResponseUtil(200,"Save",null);
    }


    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateVehicle(@RequestBody VehicleDTO vehicleDTO) {
        vehicleService.updateVehicle(vehicleDTO);
        return new ResponseUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"vid"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteVehicle(@RequestParam String vid) {
        vehicleService.deleteVehicle(vid);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{vid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchVehicle(@RequestParam String vid) {
        return new ResponseUtil(200,"Ok",vehicleService.searchVehicle(vid));
    }
}
