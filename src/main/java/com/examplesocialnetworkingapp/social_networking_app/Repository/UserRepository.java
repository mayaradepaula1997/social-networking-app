package com.examplesocialnetworkingapp.social_networking_app.Repository;

import com.examplesocialnetworkingapp.social_networking_app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

    // < Passar a entidade que deseja tratar , Tipo de dado da chave primaria (Long)  >
}
