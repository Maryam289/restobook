package edu.vsu.dto;

import edu.vsu.model.Employee;
import edu.vsu.model.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RestaurantDto implements Serializable {
    private final int id;
    private final String name;
    private final String legalEntityName;
    private final int inn;
    private final String comment;
    private final List<List<Employee>> employees;
    private final List<List<Table>> tables;
}
