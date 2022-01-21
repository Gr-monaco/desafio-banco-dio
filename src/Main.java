
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Cliente ricardo = new Cliente();
		ricardo.setNome("Ricardo");
		
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro");
		
		Conta cc = new ContaCorrente(venilton);
		Conta cc2 = new ContaCorrente(ricardo);
		Conta cc3 = new ContaCorrente(pedro);
		Conta poupanca = new ContaPoupança(venilton);

		Banco ricardoBank = new Banco();
		ricardoBank.setNome("RicardoBank");
		ricardoBank.addConta(cc);
		ricardoBank.addConta(cc2);
		ricardoBank.addConta(cc3);
		
		ricardoBank.listarContas();
		
		cc.depositar(100);
				
		cc.transferir(25, poupanca);

		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
