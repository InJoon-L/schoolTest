package Quiz;

import java.util.Scanner;

public class Quiz_8 {
	public static void main(String[] args) {
		//문자열 배열의 크기 
		final int MAX_SIZE = 50;
		
		//문자열 띄우기
		int count 			= 0;
		int danCount 		= 0;
		
		//랜덤숫자에서 배수 값 검색 갯수세기
		int randomDanCount 	= 0;
		
		//int형 정수 50개 배열 선언
		int randomValues[] = new int[MAX_SIZE];
		Scanner scn = new Scanner(System.in);
		
		//1 ~ 200 사이의 정수형 난수를 발생하여 배열에 저장 : 50개
		//Math.random() 호출 시 0이상 1미만의 실수형 값 반환
		for (int iCount = 0; iCount < MAX_SIZE; iCount++) {
			randomValues[iCount] = (int)((Math.random() * 200 + 1));
			
			//중복된 수를 발견 시 재 설정
			for (int jCount = 0; jCount < iCount; jCount++) {
				if(randomValues[iCount] == randomValues[jCount]) {
					iCount--;
					break;
				}
			}
		}

		//발생된 난수 값 화면에 출력
		for (int iCount = 0; iCount < MAX_SIZE; iCount++) {
			System.out.print("\t" + randomValues[iCount]);
			count++;
			if (count == 7) {
				System.out.println();
				count = 0;
			}
		}
		
		//배수 값 검색
		System.out.print("\n\n배수 값 검색 용 정수를 입력하세요(1이상 정수) ");
		int inputDan = scn.nextInt();
		while (inputDan < 1) {
			System.out.print("Error Msg 1이상 정수를 입력하세요 ");
			inputDan = scn.nextInt();
		}
		
		//배수 값 출력
		System.out.printf("\n\n%d배수 값\n", inputDan);
		for (int iCount = 0; iCount < randomValues.length; iCount++) {
			if (randomValues[iCount] % inputDan == 0) {
				System.out.print("\t" + randomValues[iCount] );
				danCount++;
				randomDanCount++;
			}
			if (danCount == 5) {
				System.out.println();
				danCount = 0;
			}
		}
		System.out.printf("\n\n%d 배수 값 갯수 : %d", inputDan, randomDanCount);
		scn.close();
	}
}
