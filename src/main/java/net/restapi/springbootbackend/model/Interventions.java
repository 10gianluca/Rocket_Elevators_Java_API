package net.restapi.springbootbackend.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="interventions")
public class Interventions {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id")
    private long id;
    @Column(name = "Author")

    private String Author;
    @Column(name = "CustomerID")

    private long CustomerID;
    @Column(name = "BuildingID")

    private long BuildingID;
    @Column(name = "BatteryID")

    private long BatteryID;
    @Column(name = "ColumnID")

    private long ColumnID;
    @Column(name = "ElevatorID")

    private long ElevatorID;
    @Column(name = "EmployeeID")


    private String EmployeeID;
    @Column(name = "StartDate")

    private String StartDate;
    @Column(name = "EndDate")

    private String EndDate;
    @Column(name = "Result")

    private String Result;
    @Column(name = "Report")

    private String Report;
    @Column(name = "Status")

    private String Status;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;



}
