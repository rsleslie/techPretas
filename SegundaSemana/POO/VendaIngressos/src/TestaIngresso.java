public class TestaIngresso {
	public static void main(String[] args) {
		
		Ingresso ingresso1 = new Ingresso("VIP", "Teatro Municipal", "02/05/2023", 100.0f, 50);
		Ingresso ingresso2 = new Ingresso("Normal", "Cineflix", "03/05/2023", 20.0f, 100);

		System.out.println("\nIngresso 1:\n");
		ingresso1.visualizar();

		System.out.println("\nIngresso 2:\n");
		ingresso2.visualizar();
	}
}
