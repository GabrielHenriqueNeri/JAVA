
public class Gato extends Mamifero {

	String corDoPelo;

	public Gato(String nome, double peso, String corDoPelo) {
		super(nome, peso);
		this.corDoPelo = corDoPelo;
	}
		public void amamentar(String tipoComida) {
			System.out.println("eu posso brincar" + " Quero comer " + tipoComida);
	}

	public Gato(String nome, double peso) {
		super(nome, peso);
	}

	public void miar() {

		System.out.println("Miado: Miauuuu");
	}

	public void ronronar() {
		System.out.println("ronronar: Grrrrr");

	}

	public void lamber() {
		System.out.println("Lamber: Schlep");
	}

	// Sobrecarga de método latir
	public void miar(int vezes) {
		for (int i = 0; i < vezes; i++) {
			System.out.println("miau");
		}
		}
public String getCorDoPelo(){
	return corDoPelo;
}
public void setCorDoPelo(String corDoPelo) {
	this.corDoPelo = corDoPelo;
}
	}
