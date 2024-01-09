package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IPacienteRepository;
import com.uce.edu.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService {
	@Autowired
	private IPacienteRepository pacienteRepository;

	@Override
	public void guardar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.insertar(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.actualizar(paciente);
	}

	@Override
	public Paciente buscarPorPaciente(String nombre) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.seleccionarPorPaciente(nombre);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepository.eliminar(id);
	}

}
