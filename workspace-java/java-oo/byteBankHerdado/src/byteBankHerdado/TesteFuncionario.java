package byteBankHerdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente nico = new Gerente();

		nico.setNome("Nico");
		nico.setCpf("123123123-23");
		nico.setSalario(2600.00);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
