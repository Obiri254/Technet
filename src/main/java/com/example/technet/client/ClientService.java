package com.example.technet.client;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {
    private final static String USER_NOT_FOUND_MSG =
            "user with email %s not found";

    @Autowired
    private final ClientRepository clientRepository;


//    @Override
//    public UserDetails loadUserByUsername(String email)
//            throws UsernameNotFoundException {
//        return clientRepository.findByEmail(email)
//                .orElseThrow(()->
//                        new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
//    }
}
