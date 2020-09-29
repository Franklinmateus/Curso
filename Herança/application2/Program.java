package application2;

import entities2.Conta;
import entities2.ContaEmpresarial;
import entities2.ContaPoupanša;

public class Program {

	public static void main(String[] args) {
	
		Conta acc = new Conta(1001, "Alex", 0.0);
		ContaEmpresarial bacc = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Conta acc1 = bacc;
		Conta acc2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
		Conta acc3 = new ContaPoupanša(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		ContaEmpresarial acc4 = (ContaEmpresarial) acc2;
		acc4.emprestimo(100.0);
		
		// ContaEmpresarial acc5 = (ContaEmpresarial) acc3;
		
		if (acc3 instanceof ContaEmpresarial) {
			ContaEmpresarial acc5 = (ContaEmpresarial) acc3;
			acc5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}
		
		if(acc3 instanceof ContaPoupanša) {
			ContaPoupanša acc5 = (ContaPoupanša) acc3;
			acc5.atualizarSaldo();
			System.out.println("Update");
		}
		
	}

}
