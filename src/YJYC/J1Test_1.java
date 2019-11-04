package JavaTest;

import java.util.Scanner;

public class J1Test_1 {
	
	// <<--
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("입력 값");
		
		//사용자에게 정수를 저장한다.
		
		int num 	= scn.nextInt();
		char apb 	= 'A';

		//입력받은 정수가 0이하라면 에러 메시지 출력 후 다시 입력받는다.
		while (num < 1) {
			System.out.println("1이상 양수를 입력하세요");
			num = scn.nextInt();
		}
		
		System.out.println("\n\n결과 값");
		//입력받은 정수 만큼 알파벳을 출력
		for (int i = 0; i < num; i++) {
			//알파벳이 Z를 넘어가면 다시 A로 초기화 해준다.
			if (apb > 'Z') {
				apb = 'A';
			}
			//알파벳 C, H, K, P일땐 카운터를 안하고 출력하지 않는다.
			if (apb == 'C'|| apb == 'H' || apb == 'K' || apb == 'P') {
				i--;
			//위 조건이 아니라면 알파벳을 출력한다.
			}else {
				//맨 마지막에 ,가 출력 되면 안됨으로 맨 처음에 출력을 안시키므로써 마지막에 출력을 안시킵니다.
				if (i != 0) {
					System.out.print(", ");
				}
				System.out.print(apb);
			}
			apb++;
		}
		scn.close();
	}
	
	// -->>
}
