package Example_Studying;

import java.util.Scanner;

public class Day4_Class_vs_Instance {

	private int age;
	private String str_age;

	public Day4_Class_vs_Instance(int initialAge) {
		// �ʱⰪ

		if (initialAge < 0) { // �ʱⰪ���� ���� ���̰�, 0���� ������
			System.out.println("Age is not valid, setting age to 0.");
		} else {// 0�� �ƴϸ�, �ٸ� Ŭ�������� �޾ƿ� �Ķ���͸� �������ؼ� ���.
			age = initialAge;
		}

	}

	public void amIOld() {
		// Write code determining if this person's age is old and print the correct
		// statement:

		if (age < 13) {
			str_age = "You are young.";
		} else if (age >= 13 && age < 18) {
			str_age = "You are a teenager.";
		} else
			str_age = "You are old.";

		System.out.println(str_age);
	}

	public void yearPasses() {
		// Increment this person's age.
		age++;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4_Class_vs_Instance p = new Day4_Class_vs_Instance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) { //3���� ���� �Ķ�� �ǹ� ??
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}
