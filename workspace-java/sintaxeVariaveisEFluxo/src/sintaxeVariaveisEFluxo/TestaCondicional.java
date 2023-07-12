package sintaxeVariaveisEFluxo;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos, entre");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem mais de 18, mas está acompanhado, pode entrar");
			} else {
				System.out.println("Não pode entrar");
			}
		}
		
		// Ternário
		String condicao = idade >= 18 ? "Maior de idade " : "Menor de idade";
		System.out.println(condicao);
	}

}
