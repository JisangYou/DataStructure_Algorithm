package Example_Studying;

import java.util.Scanner;

public class Day1_Data_Types {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank";

		Scanner scan = new Scanner(System.in);

		int j = 0;
		double e = 0.0;
		String st;
		j = scan.nextInt();
		e = scan.nextDouble();
		st = scan.nextLine();
		st = scan.nextLine();
		System.out.println(j + i);
		System.out.println(e + d);
		System.out.println(s + st);
		scan.close();
		//next()�� ���๮��, ������ �����ϰ� ���ڸ� �Է�
		// nextLine()�� �� �� ������ �Է¹ޱ� ������ ���๮�ڵ� �� �ٷ� �ν�
	}

}
