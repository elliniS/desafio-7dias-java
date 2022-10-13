package dia.seis;

public class Soma {

	public static void main(String[] args) {
		int[] listaNumeros = { 1, 2, 3, 4 };
		int soma = 0;

		for (int n : listaNumeros) {
			soma += n;
		}

		System.out.println("A soma deu " + soma);
	}

}
