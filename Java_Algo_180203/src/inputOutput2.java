import java.util.Scanner;

public class inputOutput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int input1, input2;
		System.out.println("input1의 값을 입력하세요");
		input1 = sc.nextInt();
		System.out.println("input2의 값을 입력하세요");
		input2 = sc.nextInt();
		System.out.println("result is....");
		System.out.println(input1-input2);
	}

}
