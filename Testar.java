
public class Testar {

	public static void main(String[] args) {

		Gato frajola = new Gato("Frajola", 4.5,"Laranja");
		
		System.out.println(frajola.getNome());
		System.out.println(frajola.getPeso());
		System.out.println(frajola.getCorDoPelo());
		frajola.miar();
		frajola.amamentar("whiskas sach�");
		frajola.ronronar();
		frajola.miar(6);
	}
}
