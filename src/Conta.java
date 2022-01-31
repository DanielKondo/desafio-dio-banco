
public class Conta{
	
	private static int SEQUENCIAL = 10000;
	
	protected Agencia agencia;
	protected int numero;
	protected double saldo;
	protected Cliente titular;
	
	public Conta(Cliente titular, Agencia agencia) {
		this.agencia = agencia;
		this.numero = SEQUENCIAL++;
		this.titular = titular;
		titular.addConta(this);
		agencia.addConta(this);
		this.saldo = 0;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return this.agencia.getNumero();
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	protected void imprimirInfoComum() {
		System.out.println("Titular: " + this.titular.getNome());
		System.out.println("Agencia: " + this.agencia.getNumero());
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);

	}
	
}
