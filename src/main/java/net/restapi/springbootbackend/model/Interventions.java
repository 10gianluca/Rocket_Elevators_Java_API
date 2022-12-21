package net.restapi.springbootbackend.model;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="interventions")
public class Interventions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Author")

    private String Author;
    @Column(name = "CustomerID")

    private Integer CustomerID;
    @Column(name = "BuildingID")


    private Integer BuildingID;
    @Column(name = "BatteryID")

    private Integer BatteryID;
    @Column(name = "ColumnID")

    private Integer ColumnID;
    @Column(name = "ElevatorID")

    private Integer ElevatorID;
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




}
