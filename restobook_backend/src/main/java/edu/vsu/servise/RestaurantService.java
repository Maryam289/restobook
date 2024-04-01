package edu.vsu.servise;

import edu.vsu.model.Restaurant;
import edu.vsu.repository.MenuItemRepository;
import edu.vsu.repository.OrderRepository;
import edu.vsu.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//
//@Service
//public class RestaurantService {
//
//    @Autowired
//    private RestaurantRepository restaurantRepository;
//
//    public Restaurant saveRestaurant(Restaurant restaurant) {
//        return restaurantRepository.save(restaurant);
//    }
//
//    // другие методы
//}

@Service
public class RestaurantService {
    private final MenuItemRepository menuItemRepository;
    private final OrderRepository orderRepository;

    @Autowired
    public RestaurantService(MenuItemRepository menuItemRepository, OrderRepository orderRepository) {
        this.menuItemRepository = menuItemRepository;
        this.orderRepository = orderRepository;
    }

    // методы для работы с данными
}
