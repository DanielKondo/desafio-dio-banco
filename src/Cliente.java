import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private List<Conta> contas;
	
	
	public Cliente(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	
	public String getNome() {
		return this.nome;
	}

	public List<Conta> getContas(){
		return this.contas;
	}
	
	public void addConta(Conta conta) {
		this.contas.add(conta);
	}
	
}
