package Algorithm_Training;

import java.util.Scanner;

public class Plus_Minus {

	static void plusMinus(int[] arr) {

		double positive = 0, negative = 0, zero = 0;
		double total = arr.length;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positive++;
			} if (arr[i] == 0) {
				zero++;
			} if (arr[i] < 0) {
				negative++;
			}
		}
		
		System.out.println(positive / total);
		System.out.println(negative / total);
		System.out.println(zero / total);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		plusMinus(arr);
		in.close();
	}

}
