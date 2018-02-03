package Algorithm_Training;

import java.util.Scanner;

public class Diagonal_Difference {

	static int diagonalDifference(int[][] a) {
		int sum = 0;
		int sum2 = 0;
		int total = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i][i];
			sum2 += a[i][a.length-1 - i];	
		}

		total = Math.abs(sum - sum2);
		
		return total;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] a = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}
		int result = diagonalDifference(a);
		System.out.println(result);
		in.close();
	}

}
