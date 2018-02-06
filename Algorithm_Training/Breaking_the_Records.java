package Algorithm_Training;

import java.util.HashSet;
import java.util.Scanner;

public class Breaking_the_Records {

	static int[] breakingRecords(int[] score) {
		int[] result;
		int countMax = 0, countMin = 0, max = score[0], min = score[0]; // �ʱⰪ�� �̸� �����������ν�, ���� ������ �̸� ����� �ʿ䰡 ����� ���⼭  �����ϰ� ó��.
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) { // ���� ������ �ʱⰪ���� ū ���� ���ö�,
				max = score[i];// 2. �ش� ū���� max���� �� �����������ν�, �ٽ� �ݺ����� ����, �� ū���� ���� �� �ִ�.
				countMax++; // 1. ���� ū���� ���Դٴ� ���� üũ�ϰ�,
			}
			if (score[i] < min) {
				min = score[i];
				countMin++;
			}
		}

		return new int[] { countMax, countMin };

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		int[] result = breakingRecords(score);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}

}


// �̷� �˰��� ������ �Ӹ��ӿ� �� �ȱ׷����� �ָԾ���.
// ���ǹ��� �ɾ��� ������, �ʹ� �а� ������ �ʿ䰡 ����.