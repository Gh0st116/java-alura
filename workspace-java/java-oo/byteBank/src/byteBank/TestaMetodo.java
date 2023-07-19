package byteBank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);

		System.out.println(contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		boolean transferiuComSucesso = contaDaMarcela.transfere(300, contaDoPaulo);

		if (transferiuComSucesso) {
			System.out.println("Transferência com sucesso :)");
		} else {
			System.out.println("Faltou dinheiro :(");
		}

		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);

		contaDoPaulo.titular = "paulo silveira";
		System.out.println(contaDoPaulo.titular);
	}

}
