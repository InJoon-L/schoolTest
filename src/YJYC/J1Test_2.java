package JavaTest;

import java.util.Scanner;

public class J1Test_2 {
	
	// <<--
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("1이상 N까지의 정수 중, 5또는 3의 배수를 출력 N값을 입력하세요");
		//사용자로부터 정수 값을 입력받는다.
		int num = scn.nextInt();
		
		//입력받은 정수 값이 0이하라면 에러 메시지 출력 후 다시 입력받는다.
		while (num < 1) {
			System.out.println("1이상 양수를 입력하세요");
			num = scn.nextInt();
		}
		
		//사용자로부터 입력받은 값을 차례대로 출력
		for (int i = 1; i <= num; i++) {
			//3의 배수일 때 출력
			if (i % 3 == 0) {
				System.out.println("3의 배수 : " + i);
			//5의 배수일 때 출력
			}else if (i % 5 == 0) {
				System.out.println("5의 배수 : " + i);
			}
		}
		scn.close();
	}
	
	// -->>
}
