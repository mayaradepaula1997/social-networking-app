package com.examplesocialnetworkingapp.social_networking_app.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //criar os getter e setters
@AllArgsConstructor // criar o construtor com argumento
@NoArgsConstructor // criar os construtor padrão
@Entity //sinalizar que é uma classe mapeada pelo JPA
@Table(name = "tags" , schema = "SOCIALNETWORK")
public class Tag {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tags_sq") //auto incremento
    @SequenceGenerator(schema = "SOCIALNETWORK", name = "tags_sq", sequenceName = "tags_sq", initialValue = 1, allocationSize = 1)
    private Long Id;

    @ManyToOne //Um post pode ter varias tags
    @JoinColumn (name = "posts_id")  //Campo de referência
    private Post post;

    @ManyToOne
    @JoinColumn (name = "users_id")  //Campo de referência
    private User user;


}




