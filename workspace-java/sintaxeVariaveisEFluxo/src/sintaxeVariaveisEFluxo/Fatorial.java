package sintaxeVariaveisEFluxo;

public class Fatorial {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int resultadoFatorial = i;

			for (int x = i - 1; x > 0; x--) {
				resultadoFatorial *= x;
			}

			System.out.println(i + "! = " + resultadoFatorial);
		}
	}

}
