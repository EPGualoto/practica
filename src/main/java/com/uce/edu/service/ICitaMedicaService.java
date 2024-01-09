package com.uce.edu.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.uce.edu.repository.modelo.CitaMedica;

public interface ICitaMedicaService {
	public void guardar(CitaMedica citaMedica);

	public void actualizar(String numCita, String diagnostico, String recta, LocalDate fechaProximaCita);

	public CitaMedica buscarPorCitaMedica(Integer id);

	public void agendar(String numCita, LocalDate fechaCita, BigDecimal valorCita, String LugarCita,String cedulaDoctor, String cedulaPaciente);

}
