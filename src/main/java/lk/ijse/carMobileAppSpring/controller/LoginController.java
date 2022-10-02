package lk.ijse.carMobileAppSpring.controller;

import lk.ijse.carMobileAppSpring.dto.LoginDTO;
import lk.ijse.carMobileAppSpring.service.LoginService;
import lk.ijse.carMobileAppSpring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllLogin() {
        return new ResponseUtil(200,"Ok",loginService.getAllLogin());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveLogin(@RequestBody LoginDTO loginDTO) {
        loginService.saveLogin(loginDTO);
        return new ResponseUtil(200,"Save",null);
    }


    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateLogin(@RequestBody LoginDTO loginDTO) {
        loginService.updateLogin(loginDTO);
        return new ResponseUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"lid"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteLogin(@RequestParam String lid) {
        loginService.deleteLogin(lid);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{lid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchLogin(@RequestParam String lid) {
        return new ResponseUtil(200,"Ok",loginService.searchLogin(lid));
    }
}
