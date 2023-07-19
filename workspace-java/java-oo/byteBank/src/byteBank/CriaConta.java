package byteBank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();

		primeiraConta.agencia = 146;
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;

		System.out.println("Primeira conta tem " + primeiraConta.saldo + " reais\n" + "Segunda conta tem "
				+ segundaConta.saldo + " reais");

		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

		System.out.println(segundaConta.agencia);

		segundaConta.agencia = 146;
		System.out.println("Agora a agência da segunda conta é " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		} else {
			System.out.println("São contas diferentes");
		}
	}

}
