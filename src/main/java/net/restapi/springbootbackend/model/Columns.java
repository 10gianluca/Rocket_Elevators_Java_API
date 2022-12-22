package net.restapi.springbootbackend.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="columns")
public class Columns {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id")
    private long id;
    @Column(name = "battery_id")

    private Integer battery_id;
    @Column(name = "Type")

    private String Type;
    @Column(name = "number_of_floors_served")

    private String number_of_floors_served;
    @Column(name = "Status")

    private String Status;
    @Column(name = "Information")

    private String Information;

    @Column(name = "Notes")
    private String Notes;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;


}