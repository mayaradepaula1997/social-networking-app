package com.examplesocialnetworkingapp.social_networking_app.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "followers", schema = "SOCIALNETWORK" )
public class Follower {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "followers_sq") //auto incremento
    @SequenceGenerator(schema = "SOCIALNETWORK", name = "followers_sq", sequenceName = "followers_sq", initialValue = 1, allocationSize = 1)
    private Long Id;


    @ManyToOne //Um 'usuario/user" tem varios seguidores
    @JoinColumn(name = "followers_id") //campo de referência
    private User follower;


    @ManyToOne
    @JoinColumn(name = "users_id") //campo de referência
    private User user;



}
