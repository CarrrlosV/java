package agendabd;

public class Contato {

	public static void main(String[] args) {
		ConexaoDados bdcontato = new ConexaoDados();
		bdcontato.conectar();

		if (bdcontato.estaConectado()) {
//			bdcontato.listarContato();
//			bdcontato.inserirContato("TESTE", "985530-7451");
//			bdcontato.editarContato(3,"Laiane Andrade","7777-7777");
//			bdcontato.apagarContato(4);
			bdcontato.desconectar();
		} else {
			System.out.println("Não foi possivel conectar!");
		}
	}

}
