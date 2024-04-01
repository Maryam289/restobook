//package edu.vsu.model;
//
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
//@Entity
//@Table(name = "orders")
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<MenuItem> items;
//
//    private double total;
//
//    // constructors, getters, setters
//}
//
