package com.example.technet.registration;

import com.example.technet.client.Client;
import com.example.technet.client.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class RegistrationService {
//    public String register (RegistrationRequest request){
//        return "works";
//    }
    @Autowired
    ClientRepository clientRepository;
    public Client register (@RequestBody Client request){

        return clientRepository.save(request);
    }

}
