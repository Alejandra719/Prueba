package com.SpringPrueba.dao;

import org.springframework.data.repository.CrudRepository;

import com.SpringPrueba.modelo.Empleado;

public interface EmpleadoDao extends CrudRepository<Empleado, Integer>{

}
