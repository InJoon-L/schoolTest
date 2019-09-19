package starTest;

import java.util.Scanner;

public class OperTest_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.print("성별을 입력하세요: <남성 1, 여성 2>");
		int gender 	= scn.nextInt();
		System.out.print("체중을 입력하세요.");
		int kg		= scn.nextInt();
		
		//남성
		if (gender == 1) {
			if (kg >= 85) {
				System.out.println("과체중 입니다. 운동하세요");
			}else if (kg >= 50 && kg < 85) {
				System.out.println("표준체중 입니다. 현 페이스 유지하세요");
			}else {
				System.out.println("표준체중 이하 입니다. 고기 드세요");
			}
		}
		//여성
		if (gender == 2) {
			if (kg >= 68) {
				System.out.println("과체중 입니다. 운동하세요");
			}else if (kg >= 40 && kg < 68) {
				System.out.println("표준체중 입니다. 현 페이스 유지하세요");
			}else {
				System.out.println("표준체중 이하 입니다. 고기 드세요");
			}
		}
		scn.close();
	}
}
