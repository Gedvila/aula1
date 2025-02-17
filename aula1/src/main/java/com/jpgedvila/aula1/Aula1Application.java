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

		Order order1 = new Order(1034,150.00,20);
		Order order2 = new Order(2282,800.00,10);
		Order order3 = new Order(1309,95.90,0.0);

		System.out.println("Código do pedido: " + order1.getCode());
		System.out.println("Preço total do pedido: " + orderService.total(order1));

		System.out.println("Código do pedido: " + order2.getCode());
		System.out.println("Preço total do pedido: " + orderService.total(order2));

		System.out.println("Código do pedido: " + order3.getCode());
		System.out.println("Preço total do pedido: " + orderService.total(order3));

	}
}
