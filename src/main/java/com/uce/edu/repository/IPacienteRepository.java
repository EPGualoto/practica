package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Paciente;

public interface IPacienteRepository {
	public void insertar(Paciente paciente);

	public void actualizar(Paciente paciente);

	public void eliminar(Integer id);

	public Paciente seleccionarPorPaciente(String nombre);
	
	public Paciente seleccionar(Integer id);
}
