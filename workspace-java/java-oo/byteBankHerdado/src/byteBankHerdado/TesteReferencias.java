package byteBankHerdado;

public class TesteReferencias {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSalario(5000.0);
		
		Designer designer = new Designer();
		designer.setSalario(2000.0);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(designer);
		controle.registra(editorVideo);
		
		System.out.println(controle.getSoma());
	}

}
