package agendabd;

public class Contato {

	public static void main(String[] args) {
		ConexaoDados bdcontato = new ConexaoDados();
		bdcontato.conectar();

		if (bdcontato.estaConectado()) {
			bdcontato.listarContato();
			bdcontato.inserirContato("Laiane Andrade", "985530-7451");
//			bdcontato.editarContato();
//			bdcontato.apagarContato();
//			bdcontato.desconectar();
		} else {
			System.out.println("Não foi possivel conectar!");
		}
	}

}
