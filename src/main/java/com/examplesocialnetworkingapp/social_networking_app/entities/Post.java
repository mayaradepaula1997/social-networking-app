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
@Table(name = "posts", schema = "SOCIALNETWORK")
public class Post {

    @Id //chave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posts_sq")
    @SequenceGenerator(schema = "SOCIALNETWORK", name = "posts_sq", sequenceName = "posts_sq", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "text_content") //colocar o nome que vai ficar no banco de dados
    private String textContent;


    @CreationTimestamp // data de criação
    @Column(name = "created_at")
    private LocalDateTime createdAt;


    @UpdateTimestamp // data de atualização
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


    @ManyToOne //Um usuario pode ter varias postagens
    @JoinColumn(name = "users_id") //nome da tabela de relacionamento com "users"
    private User user;
}


