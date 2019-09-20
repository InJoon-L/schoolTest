package starTest;

import java.util.Scanner;

public class OperTest_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("다섯자리 정수를 입력하시오!!");
		String inputNum = scn.nextLine();
		int result = 0;
		
		//입력값을 하나하나 빼서 더하고 메세지 출력
		for (int i = 0; i < inputNum.length(); i++) {
			int temp = (inputNum.charAt(i) - '0');
			result += temp;
			System.out.print(temp);
			if (inputNum.length() - 1 != i) {
				System.out.print("+");
			}
		}
		System.out.print("=" + result);
		scn.close();
	}
}
