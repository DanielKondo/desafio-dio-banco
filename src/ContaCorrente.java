
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente titular, Agencia agencia) {
		super(titular, agencia);
	}

	public void imprimirExtratos() {
		
		System.out.println("=======Conta Corrente=======");
		this.imprimirInfoComum();
		
	}
}
