package dia.tres;

public class MaiorMenorMain {

	public static void main(String[] args) {
		MaiorMenor veri = new MaiorMenor();
		int[] listas = { -4, -8, 9, 1, 10, 7, 3};

		System.out.println("O maior numero e: " + veri.VerificaMaior(listas));
		System.out.println("O menor numero e: " + veri.VerificaMenor(listas));
	}

}