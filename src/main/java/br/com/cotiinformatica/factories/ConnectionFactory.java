package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	// m�todo para retornar conex�es com o banco de dados
	public static Connection openConnection() throws Exception {

		// Nome do DRIVER JDBC para conex�o com o banco de dados
		Class.forName("org.postgresql.Driver");

		// abrindo conex�o com o banco de dados
		return DriverManager.getConnection("jdbc:postgresql://localhost:5433/bd_agendacontatos", "postgres", "coti");
	}

}
