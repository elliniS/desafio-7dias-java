package dia.sete;

public class IndiceArray {
	public int achaIndex(int[] lista, int numero) {
		for (int i = 0; i < lista.length; i++) {
			if (numero == lista[i]) {
				return i;
			}
		}

		return -1;
	}
}
