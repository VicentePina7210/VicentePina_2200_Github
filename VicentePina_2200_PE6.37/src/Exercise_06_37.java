/********
 * 
 * @author Vicente Pina
 *Date:11/11/2022
 *
 */
import java.util.Scanner;
public class Exercise_06_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		
		System.out.println("The formatted number is " + format(number,width));
		
		input.close();
	}

	public static String format(int n, int w) {
			String result = n + "";
			int len = w- result.length();
			for ( int i = 0; i < len; i++) {
				result = "0" + result;
			}
			return result;
		}}
	
