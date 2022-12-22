package net.restapi.springbootbackend.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="batteries")
public class Batteries {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id")
    private long id;
    @Column(name = "building_id")

    private Integer building_id;
    @Column(name = "buildingType")

    private String buildingType;
    @Column(name = "status")

    private String status;
    @Column(name = "employeeId")

    private Long employeeId;
    @Column(name = "dateofcomissioning")

    private String dateofcomissioning;

    @Column(name = "dateoflastinspection")
    private String dateoflastinspection;

    @Column(name = "certificationofops")
    private String certificationofops;

    @Column(name = "information")
    private String information;

    @Column(name = "notes")
    private String notes;

    @Column(name = "created_at")
    private String created_at;
    @Column(name = "updated_at")
    private String updated_at;




}