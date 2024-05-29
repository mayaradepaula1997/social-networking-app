package com.examplesocialnetworkingapp.social_networking_app.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data //gerar os getters e setters
@AllArgsConstructor //gerar os construtor com argumento
@NoArgsConstructor //gerar o construtor padrao
@Entity //sinalizar que é uma classe mapeada pelo JPA
@Table(name = "likes", schema = "SOCIALNETWORK")
public class Like {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "likes_sq")
    @SequenceGenerator(schema = "SOCIALNETWORK", name = "likes_sq", sequenceName = "likes_sq", initialValue = 1, allocationSize = 1)
    private Long id;

    @CreationTimestamp //Data de criação
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp //Data de atualização
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne // Um Post pode ter varios likes
    @JoinColumn(name = "posts_id") //relacionamento com a tabela "Post" //Nome do campo do relacionamento
    private Post post;

    @ManyToOne // Um Usuario pode ter varios likes
    @JoinColumn(name = "users_id") //relacionamento com a tabela "User"
    private User user;











}
