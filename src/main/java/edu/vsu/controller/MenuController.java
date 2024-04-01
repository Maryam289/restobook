package edu.vsu.controller;

import edu.vsu.servise.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/menu")
public class MenuController {
    private final RestaurantService restaurantService;

    @Autowired
    public MenuController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    // mappings для обработки HTTP запросов
}
