import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void addConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void listarContas() {
		System.out.println(String.format("---Listando clientes do Banco %s---", this.nome));
		for(Conta c : contas) {
			System.out.println(String.format("%s", c.getCliente().getNome()));
		}
	}
	
}
