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
		System.out.print("Digite n�mero da conta: ");
		int conta = sc.nextInt();
		System.out.println("Vai fazer dep�sito inicial? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.print("Digite dep�sito: ");
			double deposito = sc.nextDouble();
			db = new dadosBancarios(conta, nome, deposito);
		}else {
			db = new dadosBancarios(conta, nome);
		}
			
		System.out.println("---------------------------");
		System.out.println("Dados banc�rios. ");
		System.out.println(db);
		
		System.out.println("---------------------------");
		System.out.println("Valor de dep�sito? ");
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
