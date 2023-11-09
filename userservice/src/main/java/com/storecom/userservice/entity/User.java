package com.storecom.userservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username", length = 20)
    @NonNull
    private String name;

    @Column(name = "email")
    @NonNull
    private String email;

    @Column(name = "password")
    @NonNull
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    @NonNull
    private String city;

    @Column(name = "zip")
    private String zip;

}
