package inJo;

import java.util.Scanner;

public class J2Test_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("M값을 입력하세요");
		int firstValue	= scn.nextInt();
		System.out.println("N값을 입력하세요");
		int secondValue = scn.nextInt();
		
		if (firstValue == secondValue) {
			System.out.print("N, M 정수 값 : " + firstValue);
		}else if (firstValue > secondValue) {
			int range = firstValue - secondValue;
			System.out.printf("N : %d ~ M : %d사이 정수 값은\n", secondValue, firstValue);
			for (int i = 0; i < range + 1; i++) {
				if (i != 0) 	System.out.print(", ");
				
				System.out.printf("%d", firstValue);
				firstValue--;
			}
		}else {
			int range = secondValue - firstValue;
			System.out.printf("M : %d ~ N : %d사이 정수 값은\n", firstValue, secondValue);
			for (int i = 0; i < range + 1; i++) {
				if (i != 0) 	System.out.print(", ");
				
				System.out.printf("%d", firstValue);
				firstValue++;
			}
		}
		System.out.println("\n----감사합니다----");
		scn.close();
	}
}
