
public interface IConta {
	
	void sacar(double valor) throws SaldoInsufienteException;
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino) throws SaldoInsufienteException;
	
	void imprimirExtrato();
}
