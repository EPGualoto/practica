package com.uce.edu.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICitaMedicaRepository;
import com.uce.edu.repository.IDoctorRepository;
import com.uce.edu.repository.IPacienteRepository;
import com.uce.edu.repository.modelo.CitaMedica;
import com.uce.edu.repository.modelo.Doctor;
import com.uce.edu.repository.modelo.Paciente;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {
	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Autowired
	private IDoctorRepository doctorRepository;

	@Autowired
	private IPacienteRepository pacienteRepository;

	@Override
	public void guardar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.insertar(citaMedica);

	}

	@Override
	public void actualizar(String numCita, String diagnostico, String receta, LocalDate fechaProximaCita) {
		// TODO Auto-generated method stub
		CitaMedica citaM = this.citaMedicaRepository.seleccionarPorCitaMedica(3);
		citaM.setDiagnostico(diagnostico);
		citaM.setReceta(receta);
		citaM.setFechaProxCita(fechaProximaCita);
		this.citaMedicaRepository.actualizar(citaM);
	}

	@Override
	public CitaMedica buscarPorCitaMedica(Integer id) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.seleccionarPorCitaMedica(id);
	}

	@Override
	public void agendar(String numCita, LocalDate fechaCita, BigDecimal valorCita, String LugarCita,String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		Doctor doctor = this.doctorRepository.seleccionarPorDoctor(3);
		Paciente paciente = this.pacienteRepository.seleccionar(2);
		
		String cedulaD = doctor.getCedula();
		String cedulaP = doctor.getCedula();
		
		if(cedulaD.equals(doctor) && cedulaP.equals(cedulaP)) {
			CitaMedica cMedica = new CitaMedica();
			cMedica.setNumCita(numCita);
			cMedica.setFechaCita(fechaCita);
			cMedica.setValorCita(valorCita);
			cMedica.setLugarCita(LugarCita);
			cMedica.setDoctor(doctor);
			cMedica.setPaciente(paciente);
			this.citaMedicaRepository.insertar(cMedica);
		}else {
			System.out.println("No existen los datos ingrese nuevamente");
		}
		
	}

}
