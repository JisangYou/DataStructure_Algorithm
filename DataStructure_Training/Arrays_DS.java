package DataStructure_Training;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arrays_DS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] array = new String[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = in.next();
		}
		List<String> list = Arrays.asList(array);
		Collections.reverse(list);
		array = list.toArray(new String[list.size()]);

		for(String str : array) {
			System.out.print(str+" ");
		}
	}

}
