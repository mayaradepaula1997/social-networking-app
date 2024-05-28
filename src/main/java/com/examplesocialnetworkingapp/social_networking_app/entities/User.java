package com.examplesocialnetworkingapp.social_networking_app.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;


@Data //para inserir os Getters e Setters
@AllArgsConstructor //criar o construtor com argumento
@NoArgsConstructor //criar o construtor padrão
@Entity
@Table(name ="users", schema = "SOCIALNETWORK")
public class User {


    @Id //campo de chave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sq")
    @SequenceGenerator(schema = "SOCIALNETWORK", name = "", sequenceName = "users_sq", initialValue = 1, allocationSize = 1)
    private Long id;

    private String name;

    private String email;

    @Column(unique = true) //definir que um campo de uma entidade deve ser único
    private String username;

    private String password;

    private String bio;

    private boolean active;

    @CreationTimestamp //marcar automaticamente a data e hora em que a entidade foi criada pela primeira vez
    private LocalDateTime createdAt;

    @UpdateTimestamp // atualizar automaticamente a data e hora atuais sempre que a entidade é atualizada
    private LocalDateTime updatedAt;









}
