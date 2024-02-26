package com.picpaysimplificado.repository;

import com.picpaysimplificado.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface UserRepository extends JpaRepository<User, String> {

    Optional<User>findUserByDocument(String document);

    Optional<User>findUserById(String id);

}
