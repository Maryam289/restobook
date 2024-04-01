package edu.vsu.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;
import java.util.List;

@Entity(name = "restaurant")
@Data
@NoArgsConstructor
public class Restaurant {
    private int id;
    private String name;
    private String legalEntityName;
    private int inn;
    private String comment;
    private List<Employee> employees;
    private List<Table> tables;
    private List<Reservation> reservations;

    public Restaurant(int id, String name, String legalEntityName, int inn, String comment,
                      List<Employee> employees, List<Table> tables, List<Reservation> reservations) {
        this.id = id;
        this.name = name;
        this.legalEntityName = legalEntityName;
        this.inn = inn;
        this.comment = comment;
        this.employees = employees;
        this.tables = tables;
        this.reservations = reservations;
    }

    // Геттеры и сеттеры для всех полей

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegalEntityName() {
        return legalEntityName;
    }

    public void setLegalEntityName(String legalEntityName) {
        this.legalEntityName = legalEntityName;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}