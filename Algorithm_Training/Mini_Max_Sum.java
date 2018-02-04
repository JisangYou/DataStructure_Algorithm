package Algorithm_Training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mini_Max_Sum {

	static void miniMaxSum(int[] arr) {

		int total = 0;
		int max = 0;
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}

		for (int j = 0; j < arr.length; j++) {
			if (total - arr[j] > max) {
				max = total - arr[j];
			}
		}
		min = total - max;

		System.out.print(max + " " + min);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		miniMaxSum(arr);
		in.close();
	}
}
