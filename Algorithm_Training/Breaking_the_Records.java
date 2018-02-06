package Algorithm_Training;

import java.util.HashSet;
import java.util.Scanner;

public class Breaking_the_Records {

	static int[] breakingRecords(int[] score) {
		int[] result;
		int countMax = 0, countMin = 0, max = score[0], min = score[0]; // 초기값을 미리 세팅해줌으로써, 추후 로직에 이를 고려할 필요가 없기ㅔ 여기서  간단하게 처리.
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) { // 최초 정의한 초기값보다 큰 수가 나올때,
				max = score[i];// 2. 해당 큰수를 max값에 재 선언해줌으로써, 다시 반복문을 돌때, 이 큰수로 비교할 수 있다.
				countMax++; // 1. 먼저 큰수가 나왔다는 것을 체크하고,
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


// 이런 알고리즘 개념이 머리속에 잘 안그려져서 애먹었음.
// 조건문을 걸었기 때문에, 너무 넓게 생각할 필요가 없다.