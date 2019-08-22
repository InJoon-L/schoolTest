package test;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		
		//() -> 생성자를 호출
		Scanner scan = new Scanner(System.in);
		
		int inputVar = scan.nextInt();
		
		//음수 입력시 양수로 전환
		if (inputVar < 0) {
			inputVar = -inputVar;
			System.out.println("입력하신 값은 음수이므로 양수로 변환하겠습니다."+ inputVar);
		}else System.out.println("입력 값:"+inputVar);
		
		scan.close();
	}
}

