package Algorithm_Training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();

		ArrayList<String> array = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			array.add(arr[i] + "");
		}
		Collections.reverse(array);
		

		for (int j = 0; j < array.size(); j++) {
			System.out.print(array.get(j)+" ");
		}

	}
}
