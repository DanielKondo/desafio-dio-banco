import java.util.ArrayList;
import java.util.List;

public class Agencia {
	
	private int numero;
	private List<Conta> contas;
	
	public Agencia(int numero) {
		this.numero = numero;
		this.contas = new ArrayList<Conta>();

	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void addConta(Conta conta) {
		contas.add(conta);
	}
	
	public List<Conta> getContas(){
		return this.contas;
	}
	
}
