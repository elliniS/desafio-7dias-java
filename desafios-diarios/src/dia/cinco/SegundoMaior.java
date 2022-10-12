package dia.cinco;

import java.util.Arrays;

public class SegundoMaior {
	public String veriSegundo(int[] numeros) {
		Arrays.sort(numeros);

		for (int i = numeros.length - 1; i >= 0; i--) {
			if (numeros[numeros.length - 1] > numeros[i]) {
				return String.valueOf(numeros[i]);
			}
		}

		return "Nao a segundo maior, pois os valores sao iguais";
	}
}
