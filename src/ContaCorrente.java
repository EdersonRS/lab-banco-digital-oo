

public class ContaCorrente extends Conta {

	private double limiteCredito;
	
	public ContaCorrente(Cliente cliente, double limiteCredito) {
		super(cliente);
		this.limiteCredito = limiteCredito;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsufienteException {
		if (valor > this.saldo + this.limiteCredito) {
			throw new SaldoInsufienteException("Saldo insuficiente");
		}
		
		if (valor < this.saldo ) {
			super.sacar(valor);
		} else  {
			limiteCredito -= (valor - saldo);
			saldo = 0;
		} 
	}
	
	
}
