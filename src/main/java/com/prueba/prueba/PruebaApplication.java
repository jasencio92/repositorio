package com.prueba.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class PruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

}
// esta fracción de código genera una inserción a la base de datos
//@SpringBootApplication
//public class PruebaApplication implements CommandLineRunner {
//
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	public static void main(String[] args) {
//		SpringApplication.run(PruebaApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		String sql = "INSERT INTO usuarios (nombre, clave) VALUES ('JJ', '124')";
//
//		int rows = jdbcTemplate.update(sql);
//		if (rows > 0) {
//			System.out.println("A new row has been inserted.");
//		}
//	}
//
//}
