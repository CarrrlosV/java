package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConectaBanco {
	private Connection connection = null;
	private Statement statement = null;

	public Connection conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String servidor = "jdbc:mysql://localhost:3306/projetofinal";
			connection = DriverManager.getConnection(servidor, "root", "");
			this.statement = this.connection.createStatement();
			System.out.println("Conexão efetuada com sucesso");
			return connection;
		} catch (Exception e) {
			System.out.println("Erro ao fazer a conexao: " + e.getMessage());
		}
		return null;
	}

	public void desconectar() {
		try {
			connection.close();
			System.out.println("Conexão finalizada com sucesso");
		} catch (Exception e) {
			System.out.println("Erro ao fechar a conexao: " + e.getMessage());
		}

	}
}
