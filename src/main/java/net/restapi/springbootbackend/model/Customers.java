package net.restapi.springbootbackend.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="customers")
public class Customers {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id")
    private long id;
    @Column(name = "customer_creation_date")
    private String customer_creation_date;
    @Column(name = "user_id")
    private long user_id;
    @Column(name = "address_id")
    private long address_id;
    @Column(name = "company_name")
    private String company_name;
    @Column(name = "full_name_of_company_contact")
    private String full_name_of_company_contact;
    @Column(name = "company_contact_phone")
    private String company_contact_phone;
    @Column(name = "email_of_company_contact")
    private String email_of_company_contact;
    @Column(name = "company_description")
    private String company_description;
    @Column(name = "full_name_of_service_technical_authority")
    private String full_name_of_service_technical_authority;
    @Column(name = "technical_authority_phone_for_service")
    private String technical_authority_phone_for_service;
    @Column(name = "technical_manager_email_for_service")
    private String technical_manager_email_for_service;
    @Column(name = "created_at")
    private String created_at;
    @Column(name = "updated_at")
    private String updated_at;



}
