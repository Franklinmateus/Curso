package entities2;

public class ContaEmpresarial extends Conta {

	private Double LimiteEmprestimo; 
	
	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		LimiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return LimiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		LimiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo (double valor) {
		if(valor <= LimiteEmprestimo) {
			saldo += valor - 10;
		}
	}
}
