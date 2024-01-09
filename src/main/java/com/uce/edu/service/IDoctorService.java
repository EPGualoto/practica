package com.uce.edu.service;

import com.uce.edu.repository.modelo.Doctor;

public interface IDoctorService {
	public void guardar(Doctor doctor);

	public void actualizar(Doctor doctor);

	public Doctor buscarPorDoctor(Integer id);

	public void eliminar(Integer id);
}
