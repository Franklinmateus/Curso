package entities2;

public class ContaPoupan�a extends Conta {

	private Double taxaDeJuros;
	
	public ContaPoupan�a() {
		super();
	}

	public ContaPoupan�a(Integer numero, String titular, Double saldo, Double taxaDeJuros) {
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
