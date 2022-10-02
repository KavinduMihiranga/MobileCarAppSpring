package lk.ijse.carMobileAppSpring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class Vehicle {
    @Id
    private String vid;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehicleColor;
    private String vehiclePrice;
}
