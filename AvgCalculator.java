import java.util.Scanner;
/*
 *  Input all numbers in one line by " " and press enter
 * 
 */
public class AvgCalculator {
	public static int calculateAvg() {
		int average = 0;
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String[] s = num.split(" ");
		for(int i = 0; i < s.length; i++) {
			average += Integer.parseInt(s[i]);
		}
		average = (int)average / s.length;
		sc.close();
		return average;
	}
}
