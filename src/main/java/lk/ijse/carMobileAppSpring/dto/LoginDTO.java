package lk.ijse.carMobileAppSpring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LoginDTO {
    private String lid;
    private String loginUserName;
    private String loginPassword;
}
