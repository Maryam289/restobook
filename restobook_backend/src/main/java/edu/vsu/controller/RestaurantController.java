//package edu.vsu.controller;
//
//import edu.vsu.model.Restaurant;
//import edu.vsu.servise.RestaurantService;
//import org.springframework.beans.factory.annotation.Autowired;
//import jakarta.validation.Valid;
//import org.modelmapper.ModelMapper;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//@RequestMapping("/api/restaurants")
//public class RestaurantController {
//
//    @Autowired
//    private RestaurantService restaurantService;
//
//    @PostMapping
//    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {
//        Restaurant savedRestaurant = restaurantService.saveRestaurant(restaurant);
//        return ResponseEntity.ok(savedRestaurant);
//    }
//
//    // другие методы
//}
