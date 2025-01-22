package com.jpgedvila.aula1;

import com.jpgedvila.aula1.entities.Order;
import com.jpgedvila.aula1.services.OrderService;
import com.jpgedvila.aula1.services.ShippingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	@Autowired
	private ShippingServices shippingServices;

	public static void main(String[] args) {
		SpringApplication.run(Aula1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1234,80.0,0.2);

		System.out.println("Código do pedido: " + order.getCode());
		System.out.println("Preço total do pedido: " + orderService.total(order));

	}
}
