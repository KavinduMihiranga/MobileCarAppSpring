package lk.ijse.carMobileAppSpring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserDTO {
    private String uid;
    private String userName;
    private String userEmail;
    private String userContactNo;
    private String password;
}
