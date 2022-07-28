package com.SpringPrueba.service;

import java.util.List;

import com.SpringPrueba.modelo.Empleado;

public interface EmpleadoService {
	
	public Empleado guardar (Empleado empleado);
	public void eliminar(Integer id);
	public Empleado buscar(Integer id);
	public List<Empleado> mostrar();

}
