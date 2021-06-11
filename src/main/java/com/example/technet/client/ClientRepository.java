package com.example.technet.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
//@Transactional(readOnly = true)
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<com.example.technet.client.Client> findByEmail(String email);
}
