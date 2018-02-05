package Algorithm_Training;

import java.util.Scanner;

public class Time_Conversion {

	static String timeConversion(String s) {

		String[] time = s.split(":");
		int realTime = 0;
		String output = "";

		if (time[2].contains("PM")) {
			if (time[0].equals("12")) {
				time[0] = "00";
			}
			realTime = Integer.parseInt(time[0]) + 12;
			time[0] = realTime + "";
			output = time[0] + ":" + time[1] + ":" + time[2].substring(0, 2);

		} else if (time[2].contains("AM")) {
			if (time[0].equals("12")) {
				time[0] = "00";
			}
			output = time[0] + ":" + time[1] + ":" + time[2].substring(0, 2);
		}

		return output;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
	}

}
