package byteBankHerdado;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
//		Autenticavel referencia = new Cliente();
//		Autenticavel referencia2 = new Administrador();

		
		gerente.setNome("Gerente");
		gerente.setCpf("234234234-34");
		gerente.setSalario(5000.0);

		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(2222);
		boolean autenticou = gerente.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(gerente.getBonificacao());
	}

}
