
public class Mamifero {

	private String nome;
	private double peso;

	public Mamifero(String nome, double peso) {

		this.nome = nome;
		this.peso = peso;

	}

	public void amamentar() {
		System.out.println("eu posso amamentar!");

	}

	public String getNome() {
		return nome;

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;

	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
