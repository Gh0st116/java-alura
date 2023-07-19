package byteBankHerdado;

// contrato autenticavel (contrato generico)
// quem assina esse contrato deve implementar todos os seus metodos 
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
}
