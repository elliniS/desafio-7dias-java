package dia.cinco;

public class SegundoMain {
	public static void main(String[] args) {
		int[] n = { 5, 45, 3, 45, 1, 45, 4, 6};
		SegundoMaior s = new SegundoMaior();

		System.out.println("O segundo maior numero e : " + s.veriSegundo(n));
	}
}
