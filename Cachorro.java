
public class Cachorro extends Mamifero {

	String corDoPelo;

	public Cachorro(String nome, double peso, String corDoPelo) {
		super(nome, peso);
		this.corDoPelo = corDoPelo;
	}
		public void amamentar(String tipoComida) {
			System.out.println("eu posso amamentar!" + " Quero comer " + tipoComida);
	}

	public Cachorro(String nome, double peso) {
		super(nome, peso);
	}

	public void latir() {

		System.out.println("Latido: au au");
	}

	public void rosnar() {
		System.out.println("Rosnar: Grrrrr");

	}

	public void lamber() {
		System.out.println("Lamber: Schlep");
	}

	// Sobrecarga de método latir
	public void latir(int vezes) {
		for (int i = 0; i < vezes; i++) {
			System.out.println("au");
		}
		}
public String getCorDoPelo(){
	return corDoPelo;
}
public void setCorDoPelo(String corDoPelo) {
	this.corDoPelo = corDoPelo;
}
	}

