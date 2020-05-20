package agendabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoDados {

	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/agendabd";
		String usuario = "root";
		String senha = "";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		} catch (Exception e) {
			System.out.println("erro" + e.getMessage());
		}

	}

	public boolean estaConectado() {
		if (this.connection != null) {
			System.out.println("Esta conectado!");
			return true;
		} else {
			System.out.println("Nao esta conectado!");
			return false;
		}
	}

	public void listarContato() {
		try {
			String query = "SELECT * FROM contato ORDER BY nome";
			this.resultSet = this.statement.executeQuery(query);
			while (this.resultSet.next()) {
				System.out.println("=================================================");
				System.out.println("ID: " + this.resultSet.getString("id"));
				System.out.println("Nome: " + this.resultSet.getString("nome"));
				System.out.println("Telefone: " + this.resultSet.getString("telefone"));
				System.out.println("=================================================");
			}
		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
	}

	public void inserirContato(String nome, String telefone) {
		try {
			String query = "INSERT INTO contato(nome, telefone) VALUES ('" + nome + "','" + telefone + "');";
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
	}

	public void editarContato(int id, String novoNome, String novoTelefone) {
		try {
			String query = "UPDATE contato SET nome = '" + novoNome + "', telefone = '" + novoTelefone + "'WHERE id = "
					+ id + ";";
			this.statement.executeUpdate(query); // não retorna, é diferente do pesquisar
			System.out.println("Contato editado com sucesso !!!");
		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
	}

	public void apagarContato(int id) {
		try {
			String query = "DELETE FROM contato WHERE id = " + id + ";";
			this.statement.executeUpdate(query); // não retorna, é diferente do pesquisar
			System.out.println("Contato apagado com sucesso!!!");
		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
	}

	public void desconectar() {
		try {
			this.connection.close();
			System.out.println("Desconexão feita com suceso!!!");
		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
	}

}
