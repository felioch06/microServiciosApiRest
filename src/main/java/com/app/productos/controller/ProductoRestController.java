package com.app.productos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.productos.entities.Producto;
import com.app.productos.services.IProductoServices;

@RestController
@RequestMapping("/api/productos")
public class ProductoRestController {

	
	@Autowired
	private IProductoServices productoService;

	@GetMapping("")
	public List<Producto> index(){
	return productoService.findAll();
	}
	

	@GetMapping("/{id}")
	public Optional<Producto> ver(@PathVariable Long id){
	return productoService.findById(id);
	}

	@PostMapping("")
	public Producto create(@RequestBody Producto producto){
	return productoService.save(producto);
	}

	
}
