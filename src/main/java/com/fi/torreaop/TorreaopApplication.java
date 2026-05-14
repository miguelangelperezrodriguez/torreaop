package com.fi.torreaop;

import com.fi.torreaop.model.service.CountXML;
import com.fi.torreaop.model.service.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class TorreaopApplication {



    public static void main(String[] args) throws IOException {


		var context = SpringApplication.run(TorreaopApplication.class, args);

		System.out.println("Inicio de Servidor");

		UsuarioService servicioUsuarios =context.getBean(UsuarioService.class);
		CountXML contarXml = context.getBean(CountXML.class);

		System.out.println("Servicios cargados");


		List<String> ficherosXml = contarXml.countXmlFiles();

		servicioUsuarios.procesarXml();


	}

}
