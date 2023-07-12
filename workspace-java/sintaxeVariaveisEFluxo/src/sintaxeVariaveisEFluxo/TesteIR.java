package sintaxeVariaveisEFluxo;

public class TesteIR {

	public static void main(String[] args) {
		double salario = 3300.0;

		if (salario > 3751) {
			System.out.println("22.5%, pode deduzir R$636");
		} else if (salario > 2800) {
			System.out.println("15%, pode deduzir R$350");
		} else {
			System.out.println("7,5%, pode deduzir R$142");
		}
	}

}
