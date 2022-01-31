
public class Main {

	public static void main(String[] args) {
		Agencia agencia = new Agencia(12345);
		
		Cliente cliente = new Cliente("Daniel");

		
		ContaCorrente conta1 = new ContaCorrente(cliente,agencia);
		ContaPoupanca conta2 = new ContaPoupanca(cliente,agencia);

		conta1.imprimirExtratos();
		conta2.imprimirExtratos();
		
		conta1.depositar(1000);
		conta1.transferir(300, conta2);
		
		conta1.imprimirExtratos();
		conta2.imprimirExtratos();
		
		System.out.println(cliente.getContas());
	}

}
