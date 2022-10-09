package dia.dois;

public class Media {

	public double CalculaMedia(double[] numeros) {
		double tot = 0, resu;

		for (int i = 0; i < numeros.length; i++) {
			tot += numeros[i];
		}

		resu = tot / (numeros.length);
		return resu;
	}

}
