package com.example.technet.registration;

import com.example.technet.client.Client;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
@RequestMapping (path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

//    public String register (@RequestBody RegistrationRequest request){
//
//        return registrationService.register(request);
//    }
    @PostMapping("")
    public Client registerClient(Client client){
        return registrationService.register(client);
    }

}

