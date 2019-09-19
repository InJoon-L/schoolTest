package starTest;

import java.util.Scanner;

public class OperTest_3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("성적을 입력하세요:");
		int inputScore = scn.nextInt();
		//성적 판별
		if (inputScore >= 95) {
			System.out.println("축하합니다. A+ 입니다");
		} else if (inputScore >= 90) {
			System.out.println("축하합니다. A 입니다");
		} else if (inputScore >= 85) {
			System.out.println("축하합니다. B+ 입니다");
		} else if (inputScore >= 80) {
			System.out.println("축하합니다. B 입니다");
		} else if (inputScore >= 75) {
			System.out.println("축하합니다. C+ 입니다");
		} else if (inputScore >= 70) {
			System.out.println("축하합니다. C 입니다");
		} else if (inputScore >= 65) {
			System.out.println("축하합니다. D+ 입니다");
		} else if (inputScore >= 60) {
			System.out.println("축하합니다. D 입니다");
		} else {
			System.out.println("축하합니다. F 입니다 ^^;;");	
		}
		scn.close();
	}
}
