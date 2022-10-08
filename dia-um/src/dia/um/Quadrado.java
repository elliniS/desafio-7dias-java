package dia.um;

public class Quadrado {
	private int tamanho;

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void MostraQuadrado() {
		int[][] tam = new int[this.tamanho][this.tamanho];

		for (int i = 0; i < tam.length; i++) {
			for (int j = 0; j < tam[i].length; j++) {
				System.out.print("- ");
			}
			System.out.println();
		}
	}
}
