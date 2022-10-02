package lk.ijse.carMobileAppSpring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class VehicleDTO {
    private String vid;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehicleColor;
    private String vehiclePrice;
}
