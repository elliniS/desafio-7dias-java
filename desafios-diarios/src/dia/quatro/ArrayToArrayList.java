package dia.quatro;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		String[] array = new String[] { "ell", "1", "vic", "2" };
		ArrayList<String> arryList = new ArrayList<>(Arrays.asList(array));

		System.out.println(arryList);

	}

}
