package Algorithm_Training;

import java.util.Scanner;

public class Binary_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String num = Integer.toBinaryString(n);

		String[] numArray = num.split("");
		int count = 0;
		int total = 0;

		for (int i = 0; i < numArray.length - 1; i++) {

			if (numArray[i].equals("1")) { // StringÀÌ¹Ç·Î equals!! == ¾Æ´Ô.
				count = count + 1;
				total = count;
			} else if (numArray[i].equals("0")) {
				count = 0;
			}
		}
		System.out.println(total);
	}

}
