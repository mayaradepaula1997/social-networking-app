package com.examplesocialnetworkingapp.social_networking_app.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //gerar os getters e setters
@AllArgsConstructor //gerar os construtor com argumento
@NoArgsConstructor //gerar o construtor padrao
@Entity //sinalizar que é uma classe mapeada pelo JPA
@Table(name = "posts_photos", schema = "SOCIALNETWORK")
public class PostPhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posts_photos_sq")
    @SequenceGenerator(schema = "SOCIALNETWORK", name = "posts_photos_sq", sequenceName = "posts_photos_sq", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "photo_name")
    private String photoName;

    private String url;

    @ManyToOne //Uma postagem/post pode ter varias fotos
    @JoinColumn(name = "posts_id")
    private Post post;


}
