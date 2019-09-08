package starTest;

import java.util.Scanner;

public class mathTest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int inputValue	= 0; //미지수 x
		int result 		= 0; //계산결과
		System.out.print("--------------------------\n"
						+"	3x^5+7x+11  다항식계산프로그램\n"
						+"--------------------------\n");
		//미지수 x값을 입력
		System.out.println("x 값을 입력하시오!!");
		inputValue = scn.nextInt();
		
		//3x^5+7x+11을 계산 거듭제곱 Math.pow() 메소드 활용할 것
		result = 3 * (int)Math.pow(inputValue, 5) + 7 * inputValue + 11;
		System.out.println("주행시간: " + result);
		
		scn.close();
	}
}
