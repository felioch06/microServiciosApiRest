package com.app.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@LoadBalancerClient(name = "servicio-productos")
@EnableFeignClients
@SpringBootApplication
public class ProyectoMicroservicios1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoMicroservicios1Application.class, args);
	}

}
