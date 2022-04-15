package BC;
public class dadosBancarios {

	private int numeroConta;
	private String nome;
	private double saldo;
	
	public dadosBancarios() {
		
	}
	
	public dadosBancarios(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public dadosBancarios(int numeroConta, String nome, double depInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(depInicial);
	}
	
	public dadosBancarios(int numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void deposito(double dep) {
		saldo += dep;
	}
	
	public void saque(double saq) {
		saldo -= (saq +  5);			
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Conta: "
				+ numeroConta
				+ ", Correntista: "
				+ nome
				+ ", Saldo R$ "
				+ String.format("%.2f", saldo);
	}
	
}

