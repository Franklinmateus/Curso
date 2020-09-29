package application2;

import entities2.Conta;
import entities2.ContaEmpresarial;
import entities2.ContaPoupança;

public class Program {

	public static void main(String[] args) {
	
		Conta acc1 = new Conta(1001, "João", 1000.0);
		
		acc1.saque(200.0);
		System.out.println(acc1.getSaldo());
		
		Conta acc2 = new ContaPoupança(1002, "Maria", 1000.0, 0.01);
		acc2.saque(200.0);
		
		System.out.println(acc2.getSaldo());
		
		ContaEmpresarial acc3 = new ContaEmpresarial(1003, "Zé", 1000.0, 500.00);
		acc3.saque(200);
		
		System.out.println(acc3.getSaldo());
	}
}
