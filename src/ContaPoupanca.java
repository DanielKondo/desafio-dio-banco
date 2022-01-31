
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente titular, Agencia agencia) {
		super(titular, agencia);
	}
	
	public void imprimirExtratos() {
		
		System.out.println("=======Conta Poupança=======");
		this.imprimirInfoComum();

	}
}
