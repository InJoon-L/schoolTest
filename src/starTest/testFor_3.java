package starTest;

import java.util.Scanner;

public class testFor_3 {
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
		
		System.out.print("출력할 행 수를 입력하세요: ");
		int num = scan.nextInt();
		
		for (;;) {
			if (num < 1) {
				System.out.print("출력할 행 수를 입력하세요: ");
				num = scan.nextInt();
			}else break;
		}
		
		for (int i = 0; i < 26; i++) {
			if (set == 1) {
				for (int j = 0; j < num; j++) {
					System.out.print(min);
				}
				min++;
			}
			if (set == 2) {
				for (int j = 0; j < num; j++) {
					System.out.print(big);
				}
				big++;
			}
			System.out.println();
		}
		scan.close();
	}
}
