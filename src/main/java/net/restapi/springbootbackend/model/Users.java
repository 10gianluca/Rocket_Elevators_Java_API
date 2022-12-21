package net.restapi.springbootbackend.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="users")
public class Users {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id")
    private long id;
    @Column(name = "title")

    private String title;
    @Column(name = "first_name")

    private String first_name;
    @Column(name = "last_name")

    private String last_name;
    @Column(name = "email")

    private String email;
    @Column(name = "encrypted_password")

    private String encrypted_password;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;



}