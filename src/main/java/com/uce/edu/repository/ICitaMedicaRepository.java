package com.uce.edu.repository;

import com.uce.edu.repository.modelo.CitaMedica;

public interface ICitaMedicaRepository {
	public void insertar(CitaMedica citaMedica);

	public void actualizar(CitaMedica citaMedica);

	public CitaMedica seleccionarPorCitaMedica(Integer id);
}
