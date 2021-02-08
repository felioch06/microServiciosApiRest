package com.app.productos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.productos.dao.IProductosDao;
import com.app.productos.entities.Producto;

@Service
public class ProductoServices implements IProductoServices{
	
	@Autowired
	private IProductosDao productoDao;
	
	@Transactional(readOnly = true)
	public List<Producto> findAll(){
		return (List<Producto>) productoDao.findAll();
	}
	
	@Transactional(readOnly = true)
	public Optional<Producto> findById(Long id){
		return productoDao.findById(id);
	}
	
	@Transactional(readOnly = false)
	public Producto save(Producto dependencia){
	return productoDao.save(dependencia);
	}
}
