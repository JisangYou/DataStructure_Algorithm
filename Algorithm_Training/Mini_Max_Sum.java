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

	// �������� long���� ����϶���ߴµ�... �̸� �� �о ������ �����..
	// test���� ã�ƺ��� ���ϴ� ������ �߿� long�� �־���...
	// longŸ���� ������ int�� �Ϸ��� ���� �̻��� - ������ ������.
	
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


