package aplication;

import java.util.Locale;
import java.util.Scanner;

import BC.dadosBancarios;

public class Conta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		dadosBancarios db;
				
		System.out.print("Digite nome do correntista: ");
		String nome = sc.nextLine();
		System.out.print("Digite número da conta: ");
		int conta = sc.nextInt();
		System.out.println("Vai fazer depósito inicial? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.print("Digite depósito: ");
			double deposito = sc.nextDouble();
			db = new dadosBancarios(conta, nome, deposito);
		}else {
			db = new dadosBancarios(conta, nome);
		}
			
		System.out.println("---------------------------");
		System.out.println("Dados bancários. ");
		System.out.println(db);
		
		System.out.println("---------------------------");
		System.out.println("Valor de depósito? ");
		double deposito = sc.nextDouble();
		db.deposito(deposito);
		System.out.println();
		System.out.println("Saldo atualizado. ");
		System.out.println(db);
		
		System.out.println("---------------------------");
		System.out.println("Valor do saque? ");
		double saque = sc.nextDouble();
		db.saque(saque);
		System.out.println();
		System.out.println("Saldo atualizado. ");
		System.out.println(db);
		sc.close();
	}
}
