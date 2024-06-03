package com.examplesocialnetworkingapp.social_networking_app.Repository;

import com.examplesocialnetworkingapp.social_networking_app.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository  extends JpaRepository <Like, Long> {

    // < Passar a entidade que deseja tratar , Tipo de dado da chave primaria (Long)  >
}
