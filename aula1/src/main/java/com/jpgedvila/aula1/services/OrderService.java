package com.jpgedvila.aula1.services;

import com.jpgedvila.aula1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingServices shippingServices;

    public double total(Order order){

        double totalOrder = order.getBasic() + shippingServices.shipment(order) - (order.getBasic())*(order.getDiscount()/100);

        return totalOrder;
    }

}
