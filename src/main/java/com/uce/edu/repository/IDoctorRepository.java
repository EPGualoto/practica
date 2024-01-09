package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Doctor;

public interface IDoctorRepository {
	public void insertar(Doctor doctor);

	public void actualizar(Doctor doctor);

	public void eliminar(Integer id);

	public Doctor seleccionarPorDoctor(Integer id);

}
