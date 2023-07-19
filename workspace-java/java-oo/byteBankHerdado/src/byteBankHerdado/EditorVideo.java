package byteBankHerdado;

public class EditorVideo extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Bonificacao do editor de video");
		return 150;
	}
}
