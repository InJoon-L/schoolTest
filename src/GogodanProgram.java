package starTest;

import java.util.Scanner;

public class GogodanProgram {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int dan		= 0;
		int choice	= 0;

		do {
			System.out.println("-------------------------------------------");
			System.out.println("1. 구구단 출력");
			System.out.println("2. 프로그램 종료");
			System.out.println("-------------------------------------------");
			choice = scn.nextInt();
			
			if (choice == 1) {
				System.out.println("출력할 구구단의 단을 입력하세요. 구구단의 단은 2~9 사이 입력");
				dan = scn.nextInt();
				
				while(dan > 9 || dan < 2) {
					System.out.println("2~9사이 정수를 입력해주세요.");
					dan = scn.nextInt(); 
				}
				
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d X %d = %d%n", dan, i, dan * i);
				}
				continue;
			}else if (choice == 2) {
				System.out.println("이용해주셔서 감사합니다."); 
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			}


		} while (true);
		scn.close();
	}
}
