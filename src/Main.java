public class Main {

	public static void main(String[] args) throws SaldoInsufienteException {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton, 200d);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);			
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	
	}

}
