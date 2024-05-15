package desafio_dio_banco;

public class Program {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Ana");
		Cliente cliente2 = new Cliente("Jonas");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta cp = new ContaPoupanca(cliente2);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		
	}

}
