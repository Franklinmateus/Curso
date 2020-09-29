package entities2;

public class ContaPoupança extends Conta {

	private Double taxaDeJuros;
	
	public ContaPoupança() {
		super();
	}

	public ContaPoupança(Integer numero, String titular, Double saldo, Double taxaDeJuros) {
		super(numero, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void atualizarSaldo () {
		saldo += saldo * taxaDeJuros;
	}
}
