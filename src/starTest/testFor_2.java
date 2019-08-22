package starTest;

import java.util.Scanner;

public class testFor_2 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		char[] arrayMin = new char[26];
		char min = 'a';
		char[] arrayBig = new char[26];
		char big = 'A';
		
		for (int i = 0; i < arrayMin.length; i++) {
			arrayMin[i] = min;
			min++;
		}

		for (int i = 0; i < arrayMin.length; i++) {
			arrayBig[i] = big;
			big++;
		}
		
		System.out.print("정수를 입력하시오: ");
		int firstSet = scan.nextInt();
		
		for (;;) {
			if (!(firstSet == 1 || firstSet == 2)) {
				System.out.print("정수를 입력하시오: ");
				firstSet = scan.nextInt();
			}else break;
		}
		
		System.out.print("출력할 줄 수를 입력하세요: ");
		int secondSet = scan.nextInt();
		
		for (;;) {
			if (secondSet < 1) {
				System.out.print("출력할 줄 수를 입력하세요: ");
				secondSet = scan.nextInt();
			}else break;
		}
		
		for (int i = 0; i < secondSet; i++) {
			if (firstSet == 1) {
				System.out.println(arrayMin);
			}
			if (firstSet == 2) {
				System.out.println(arrayBig);
			}
		}
		scan.close();
	}
}
