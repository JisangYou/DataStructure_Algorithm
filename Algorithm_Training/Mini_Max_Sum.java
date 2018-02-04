package Algorithm_Training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mini_Max_Sum {

	static void miniMaxSum(int[] arr) {

		long total = 0;
	
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}

		Arrays.sort(arr);

		System.out.print((total - arr[arr.length - 1]) + " " + (total - arr[0]));
	}

	// 문제에서 long으로 사용하라고했는데... 이를 못 읽어서 굉장히 고생함..
	// test값들 찾아보니 원하는 데이터 중에 long이 있었음...
	// long타입의 값들을 int로 하려다 보니 이상한 - 값들이 나왔음.
	
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
