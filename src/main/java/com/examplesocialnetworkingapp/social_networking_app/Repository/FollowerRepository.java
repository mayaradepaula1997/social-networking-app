package com.examplesocialnetworkingapp.social_networking_app.Repository;

import com.examplesocialnetworkingapp.social_networking_app.entities.Follower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowerRepository extends JpaRepository <Follower, Long> {

    // < Passar a entidade que deseja tratar , Tipo de dado da chave primaria (Long)  >
}
