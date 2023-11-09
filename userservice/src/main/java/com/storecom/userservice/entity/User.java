package com.storecom.userservice.entity;

import lombok.*;

import javax.persistence.*;

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


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
