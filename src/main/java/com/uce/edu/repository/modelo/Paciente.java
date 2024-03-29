package com.uce.edu.repository.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {
	@Id
	@GeneratedValue(generator = "seq_paciente", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_paciente", sequenceName = "seq_paciente", allocationSize = 1)
	@Column(name = "paci_id")
	private Integer id;

	@Column(name = "paci_cedula")
	private String cedula;

	@Column(name = "paci_apellido")
	private String apellido;

	@Column(name = "paci_fecha_nacimiento")
	private LocalDate fechaNacimiento;
	
	@Column(name = "paci_codigo_seguro")
	private String codigoSeguro;

	@Column(name = "paci_estatura")
	private String estatura;

	@Column(name = "paci_peso")
	private String peso;
	
	@Column(name = "paci_genero")
	private String genero;
	
	// relación uno a muchos.
	@OneToMany(mappedBy = "paciente")
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCodigoSeguro() {
		return codigoSeguro;
	}

	public void setCodigoSeguro(String codigoSeguro) {
		this.codigoSeguro = codigoSeguro;
	}

	public String getEstatura() {
		return estatura;
	}

	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
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
		return "Paciente [id=" + id + ", cedula=" + cedula + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", codigoSeguro=" + codigoSeguro + ", estatura=" + estatura + ", peso=" + peso
				+ ", genero=" + genero + "]";
	}

}
