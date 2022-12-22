package net.restapi.springbootbackend.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="buildings")
public class Buildings {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id")
    private long id;
    @Column(name = "customer_id")

    private Integer customer_id;
    @Column(name = "Address_of_the_building")

    private String Address_of_the_building;
    @Column(name = "Full_Name_of_the_building_administrator")

    private String Full_Name_of_the_building_administrator;
    @Column(name = "Email_of_the_administrator_of_the_building")

    private String Email_of_the_administrator_of_the_building;
    @Column(name = "Phone_number_of_the_building_administrator")

    private String Phone_number_of_the_building_administrator;

    @Column(name = "full_name_of_the_technical_contact_for_the_building")
    private String full_name_of_the_technical_contact_for_the_building;

    @Column(name = "Technical_contact_email_for_the_building")
    private String Technical_contact_email_for_the_building;

    @Column(name = "Technical_contact_phone_for_the_building")
    private String Technical_contact_phone_for_the_building;

    @Column(name = "created_at")
    private String created_at;
    @Column(name = "updated_at")
    private String updated_at;




}