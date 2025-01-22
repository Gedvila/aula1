package com.jpgedvila.aula1.services;

import com.jpgedvila.aula1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingServices {
    

    public Double shipment(Order order){

        double valor;

        if (order.getBasic()<100){
            valor = 20.0;
        } else if (order.getBasic()>=100 & order.getBasic()<200) {
            valor = 12.0;
        } else {
            valor = 0.0;
        }

        return valor;
    }

}
