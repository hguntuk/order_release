package harish.example.controller;

import harish.example.dao.RequestEntity;
import harish.example.entity.OrderDetailsEntity;
import harish.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/order")
public class OrderDetailsController {
    @Autowired
    OrderService service;

    @PostMapping(value = "/details")
    public OrderDetailsEntity saveOrderDetials(@RequestBody OrderDetailsEntity entity){
        return service.saveOrderData(entity);
    }

    @GetMapping(value = "/getOrder")
    public List<OrderDetailsEntity> getOrderDetails(){
        return service.getOrderData();
    }

    @GetMapping(value = "/getOrderById")
    public List<Optional<OrderDetailsEntity>> getOrderWithEmpId(@RequestParam Integer request){
        return service.getOrderById(request);
    }

}
