package com.uce.edu.service;

import com.uce.edu.repository.modelo.Paciente;

public interface IPacienteService {
	public void guardar(Paciente paciente);

	public void actualizar(Paciente paciente);

	//public Paciente buscarPorPaciente(Integer id);
	
	public Paciente buscarPorPaciente(String nombre);

	public void borrar(Integer id);
}
