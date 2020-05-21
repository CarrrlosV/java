package controle;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import conexao.ConectaBanco;

public class ControlaCliente {

	public void salvar(String nome, String email, String telefone, String endereco, String cidade, String estado) {
		ConectaBanco banco = new ConectaBanco();
		try {
			Connection conecta = banco.conectar();
			Statement statement = conecta.createStatement();
			String sql = "INSERT INTO cliente (nome, email, telefone, endereco, cidade, estado ) VALUES ('" + nome
					+ "', '" + email + "', '" + telefone + "', '" + endereco + "', '" + cidade + "', '" + estado
					+ "');";
			statement.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Os dados foram inseridos com sucesso");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Os dados não foram inseridos devido ao erro: " + e.getMessage());
		}
	}
}
