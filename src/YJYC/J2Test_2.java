package inJo;

import java.util.Scanner;

public class J2Test_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("M���� �Է��ϼ���");
		int firstValue	= scn.nextInt();
		System.out.println("N���� �Է��ϼ���");
		int secondValue = scn.nextInt();
		
		if (firstValue == secondValue) {
			System.out.print("N, M ���� �� : " + firstValue);
		}else if (firstValue > secondValue) {
			int range = firstValue - secondValue;
			System.out.printf("N : %d ~ M : %d���� ���� ����\n", secondValue, firstValue);
			for (int i = 0; i < range + 1; i++) {
				if (i != 0) 	System.out.print(", ");
				
				System.out.printf("%d", firstValue);
				firstValue--;
			}
		}else {
			int range = secondValue - firstValue;
			System.out.printf("M : %d ~ N : %d���� ���� ����\n", firstValue, secondValue);
			for (int i = 0; i < range + 1; i++) {
				if (i != 0) 	System.out.print(", ");
				
				System.out.printf("%d", firstValue);
				firstValue++;
			}
		}
		System.out.println("\n----�����մϴ�----");
		scn.close();
	}
}
