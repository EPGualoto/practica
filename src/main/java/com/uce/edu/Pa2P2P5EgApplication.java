package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.CitaMedica;
import com.uce.edu.repository.modelo.Doctor;
import com.uce.edu.repository.modelo.Paciente;
import com.uce.edu.service.CitaMedicaServiceImpl;
import com.uce.edu.service.DoctorServiceImpl;
import com.uce.edu.service.PacienteServiceImpl;

@SpringBootApplication
public class Pa2P2P5EgApplication implements CommandLineRunner{
	@Autowired
	private DoctorServiceImpl doctorService;
	
	@Autowired
	private PacienteServiceImpl PacienteService;
	
	@Autowired
	private CitaMedicaServiceImpl citaMedicaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2P2P5EgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Doctor doc = new Doctor();
		doc.setCedula("1718411745");
		doc.setApellido("Gualoto");
		doc.setNombre("Erika");
		doc.setFechaNacimiento(LocalDate.of(1999, 11, 10));
		doc.setNumeroConsultorio("13");
		doc.setCodigoSenecyt("287a5f");
		doc.setGenero("Femenino");
		
		Paciente pac = new Paciente();
        pac.setCedula("1718411737");
        pac.setApellido("Tigrero");
        pac.setFechaNacimiento(LocalDate.of(2000, 10, 8));
        pac.setCodigoSeguro("65aaaa77");
        pac.setEstatura("170CM");
        pac.setPeso("40 KG");
        pac.setGenero("Masculino");
        
        Paciente pac2 = new Paciente();
        pac2.setCedula("1718411729");
        pac2.setApellido("Tigrero");
        pac2.setFechaNacimiento(LocalDate.of(2000, 10, 8));
        pac2.setCodigoSeguro("65aaaa77");
        pac2.setEstatura("170CM");
        pac2.setPeso("40 KG");
        pac2.setGenero("Masculino");
        
        Paciente pac3 = new Paciente();
        pac3.setCedula("1718411729");
        pac3.setApellido("Tigrero");
        pac3.setFechaNacimiento(LocalDate.of(2000, 10, 8));
        pac3.setCodigoSeguro("65aaaa77");
        pac3.setEstatura("170CM");
        pac3.setPeso("40 KG");
        pac3.setGenero("Masculino");
        this.PacienteService.guardar(pac3);
        
        List<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes.add(pac2);
		pacientes.add(pac);
		
		CitaMedica cM = new CitaMedica();
		cM.setDoctor(doc);
		cM.setPaciente(pac);
		
		CitaMedica cM2 = new CitaMedica();
		cM2.setDoctor(doc);
		cM2.setPaciente(pac2);
		
		List<CitaMedica> citaMedica = new ArrayList<CitaMedica>();
		citaMedica.add(cM2);
		citaMedica.add(cM);
		
		doc.setCitasMedicas(citaMedica);
		
		this.doctorService.guardar(doc);
		
		Doctor doctF = this.doctorService.buscarPorDoctor(3);
		System.out.println(doctF);
		
		/*CitaMedica cm = new CitaMedica();
        cm.setDiagnostico("Bien");
        cm.setFechaCita(LocalDate.of(2024, 10, 8));
        cm.setFechaProxCita(LocalDate.of(2024, 11, 8));
        cm.setReceta("Paracetamol");
        cm.setNumCita("1");
        cm.setDoctor(doc);
        cm.setPaciente(pac3);
        cm.setValorCita(new BigDecimal(5));
        cm.setLugarCita("6 de diciembre y shirys");
        this.citaMedicaService.guardar(cm);*/
        
       this.citaMedicaService.agendar("3", LocalDate.now(), new BigDecimal(60), "ELOY ALFARO - calle de las flores", "1718411745", "1718411737");
       this.citaMedicaService.actualizar("1", "gripe", "200Gm de parasetamol cada 3 horas", LocalDate.of(2023, 07, 04));
	}

}
