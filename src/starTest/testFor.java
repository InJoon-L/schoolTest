package starTest;

import java.util.Scanner;

public class testFor {
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
		
		System.out.print("출력할 알파벳 갯수를 입력하시오: ");
		int value = scan.nextInt();

		for (;;) {
			if (value < 1) {
				System.out.print("출력할 알파벳 갯수를 입력하세요: ");
				value = scan.nextInt();
			}else break;
		}
		
		for (int i = 0; i < value; i++) {
			if (set == 1) {
				System.out.print(min);
				min++;
				if (min > 'z') {
					min = 'z';
				}
			}
			if (set == 2) {
				System.out.print(big);
				big++;
				if (big > 'Z') {
					big = 'A';
				}
			}
		}
		scan.close();
	}
}
