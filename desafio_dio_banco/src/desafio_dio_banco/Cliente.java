package desafio_dio_banco;

public class Cliente {
	
	private String nome;
	
	public Cliente(String nome) {
		this.setNome(nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

}
