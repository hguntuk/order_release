package harish.example.service;

import harish.example.dao.RequestEntity;
import harish.example.entity.OrderDetailsEntity;
import harish.example.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(timeoutString = "50")
public class OrderService {
    private final Logger logger = LoggerFactory.getLogger(OrderService.class);
    @Autowired
    OrderRepository repository;

    public OrderDetailsEntity saveOrderData(OrderDetailsEntity entity){
        return repository.save(entity);
    }

    public List<OrderDetailsEntity> getOrderData(){
        return (List<OrderDetailsEntity>)repository.findAll();
    }

    public List<Optional<OrderDetailsEntity>> getOrderById(Integer request ){
        System.out.println("request = "+request);
        logger.info("request = "+request);
        return repository.findByOrderId(request);
    }
}
