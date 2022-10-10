package dia.tres;

public class MaiorMenor {
	public int VerificaMaior(int[] list) {
		int max = list[0];

		for (int i = 1; i < list.length; i++) {
			if (max < list[i]) {
				max = list[i];
			}
		}	
		
		return max;
	}

	public int VerificaMenor(int[] list) {
		int min = list[0];

		for (int i = 1; i < list.length; i++) {
			if (min > list[i]) {
				min = list[i];
			}
		}
		
		return min;
	}
}
