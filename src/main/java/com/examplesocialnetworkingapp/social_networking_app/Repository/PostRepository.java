package com.examplesocialnetworkingapp.social_networking_app.Repository;

import com.examplesocialnetworkingapp.social_networking_app.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository <Post, Long> {

    // < Passar a entidade que deseja tratar , Tipo de dado da chave primaria (Long)  >
}
