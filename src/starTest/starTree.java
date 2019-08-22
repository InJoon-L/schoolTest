package starTest;

import java.util.Scanner;

public class starTree {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char min = 'a';
		char big = 'A';
		
		System.out.print("정수를 입력하시오: ");
		int set = scan.nextInt();
			
		for (;;) {
			if (!(set == 1 || set == 2)) {
				System.out.print("정수를 입력하시오: ");
				set = scan.nextInt();
			}else {
				break;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			if (set == 1) {
				System.out.print(min);
				min++;
			}else if (set == 2) {
				System.out.print(big);
				big++;
			}
		}
		scan.close();
	}
}
