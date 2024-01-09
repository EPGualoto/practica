package com.uce.edu.repository.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_doctor")
	@SequenceGenerator(name = "seq_doctor", sequenceName = "seq_doctor", allocationSize = 1)
	@Column(name = "doct_id")
	private Integer id;
	
	@Column(name = "doct_cedula")
	private String cedula;
	
	@Column(name = "doct_nombre")
	private String nombre;
	
	@Column(name = "doct_apellido")
	private String apellido;
	
	@Column(name = "doct_fecha_nacimiento")
	private LocalDate fechaNacimiento;
	
	@Column(name = "doct_numero_consultorio")
	private String numeroConsultorio;
	
	@Column(name = "doct_codigo_senecyt")
	private String codigoSenecyt;
	
	@Column(name = "doct_genero")
	private String genero;
	
	// relación uno a muchos.
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
	private List<CitaMedica> citasMedicas;
	
	//SET Y GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate localDate) {
		this.fechaNacimiento = localDate;
	}
	public String getNumeroConsultorio() {
		return numeroConsultorio;
	}
	public void setNumeroConsultorio(String numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}
	public String getCodigoSenecyt() {
		return codigoSenecyt;
	}
	public void setCodigoSenecyt(String codigoSenecyt) {
		this.codigoSenecyt = codigoSenecyt;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public List<CitaMedica> getCitasMedicas() {
		return citasMedicas;
	}
	public void setCitasMedicas(List<CitaMedica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", numeroConsultorio=" + numeroConsultorio
				+ ", codigoSenecyt=" + codigoSenecyt + ", genero=" + genero + "]";
	}
}
