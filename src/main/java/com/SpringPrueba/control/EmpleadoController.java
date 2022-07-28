package com.SpringPrueba.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.SpringPrueba.modelo.Empleado;
import com.SpringPrueba.service.EmpleadoService;

@RestController
@CrossOrigin(origins = ("*"))
@RequestMapping("/api")

public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoS;
	
	@PostMapping("/empleados")
	public Empleado guardar(@RequestBody Empleado emple) {
		return empleadoS.guardar(emple);
		
	}
	
	@GetMapping("/empleados")
	public List<Empleado> mostrar(){
		return empleadoS.mostrar();
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado buscar(@PathVariable Integer id) {
		return empleadoS.buscar(id);
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizar( @RequestBody Empleado emple, @PathVariable Integer id) {
		Empleado empleadoActual = empleadoS.buscar(id);
		empleadoActual.setNombre(emple.getNombre());
		empleadoActual.setApellido(emple.getApellido());
		empleadoActual.setSalario(emple.getSalario());
		empleadoActual.setCorreo(emple.getCorreo());
		empleadoActual.setFechaIngreso(emple.getFechaIngreso());
		
		return empleadoS.guardar(empleadoActual);
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminar(@PathVariable Integer id) {
		empleadoS.eliminar(id);	
	}

}
