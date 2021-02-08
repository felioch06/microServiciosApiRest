package com.app.productos.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.productos.entities.Producto;

public interface IProductosDao extends CrudRepository<Producto, Long> {

}
