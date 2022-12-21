package net.restapi.springbootbackend.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="elevators")
public class Elevators {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id")
    private long id;
    @Column(name = "column_id")

    private Integer column_id;
    @Column(name = "serialNumber")

    private Integer serialNumber;
    @Column(name = "model")

    private String model;
    @Column(name = "elevatorType")

    private String elevatorType;
    @Column(name = "status")

    private String status;

    @Column(name = "commissioningDate")
    private String commissioningDate;

    @Column(name = "lastInspection")
    private String lastInspection;

    @Column(name = "inspectionCertificate")
    private String inspectionCertificate;

    @Column(name = "information")
    private String information;
    @Column(name = "notes")
    private String notes;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;




}