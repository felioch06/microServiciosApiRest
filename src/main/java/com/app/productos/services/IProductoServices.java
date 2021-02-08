package com.app.productos.services;

import java.util.List;
import java.util.Optional;

import com.app.productos.entities.Producto;

public interface IProductoServices {
	public List<Producto> findAll();
	
	public Optional<Producto> findById(Long id);
	
	public Producto save(Producto producto);
	
}
