package com.examplesocialnetworkingapp.social_networking_app.Repository;

import com.examplesocialnetworkingapp.social_networking_app.entities.PostPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostPhotoRepository  extends JpaRepository<PostPhoto, Long> {

    // < Passar a entidade que deseja tratar , Tipo de dado da chave primaria (Long)  >
}
