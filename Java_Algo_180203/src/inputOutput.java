import java.util.Scanner;

public class inputOutput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input1, input2;
		System.out.println("input1 값을 입력하세요");
		input1 = sc.nextInt();
		System.out.println("input2 값을 입력하세요");
		input2 = sc.nextInt();
		System.out.println("result is....");
		System.out.println(input1+input2);
	}

}
