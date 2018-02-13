package Algorithm_Training;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionaries_and_Maps {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map map = new HashMap();

		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			map.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			if(map.get(s)==null) {
				System.out.println("Not found");
			}else
			System.out.println(s+"="+map.get(s));
		}
		in.close();

	}

}
