package com.examplesocialnetworkingapp.social_networking_app.Repository;

import com.examplesocialnetworkingapp.social_networking_app.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository <Tag,Long> {

    // < Passar a entidade que deseja tratar , Tipo de dado da chave primaria (Long)  >

}
