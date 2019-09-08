package starTest;

import java.util.Scanner;

public class taxTest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int 		inputSum	= 0; 	//구입상품 총액
		int 		money		= 0;	//받은 돈
		int 		tax			= 0; 	//부가세액
		int			change		= 0; 	//거스름돈
		final float SURTAX		= 0.1f; //부가세율 == 10%
		
		//구입상품 총액 입력받기
		System.out.print("상품총액:");
		inputSum = scn.nextInt();

		//받은 돈 입력받기
		System.out.print("받은돈:");
		money = scn.nextInt();
		
		//부가세액 = 상품총액 * 부가세율   
		tax = (int)(inputSum * SURTAX);
		
		//거스름돈 = 받은 돈 - (상품총액 + 부가세액)
		change = money - (inputSum + tax);
		
		//받은돈이 구입상품 총액보다 적을 경우 다시 돈을 받는다
		while (change < 0) {
			System.out.println("받은돈이 부족합니다. 다시 입력하세요!!");
			System.out.print("받은돈:");
			money	= scn.nextInt();
			change	= money - (inputSum + tax);
		}
		System.out.println("부가세 " + tax);
		System.out.print("거스름돈 " + change);
		scn.close();
	}
}
