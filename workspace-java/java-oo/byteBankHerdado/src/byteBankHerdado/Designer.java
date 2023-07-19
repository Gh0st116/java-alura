package byteBankHerdado;

public class Designer extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Bonificacao do designer");
		return 200.00;
	}
}
