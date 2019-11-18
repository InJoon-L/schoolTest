package Quiz;

import java.util.Scanner;

public class Quiz_21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("입력할 문자열의 개수?");

		int stringNumber      = scn.nextInt();
		String[] inputValues   = new String[stringNumber];

		//문자열 입력받기
		for (int i = 0; i < inputValues.length; i++) {
			inputValues[i] = scn.next();
			for (int j = 0; j < inputValues[i].length(); j++) {
				char tmp = inputValues[i].charAt(j);
				if (tmp < 'A' || tmp > 'Z') {
					System.out.println("영어 대문자만 입력하시오.");
					i--;
					break;
				}
			}
		}
		//문자열 정렬 정하기
		System.out.println("정렬 방식 선택? (1) 오름, (2) 내림");
		int sortSetNumber = scn.nextInt();
		
		sort(inputValues, sortSetNumber);

		for (int i = 0; i < inputValues.length; i++) {
			System.out.println(inputValues[i]);
		}
		
		scn.close();
	}
	
	public static void sort(String[] inputValues, int setNumber) {
		//정렬
		for (int i = 0; i < inputValues.length - 1; i++) {
			int   	 index   = i;
			int      tmp     = 0;
			String   temp    = null;
			
			for (int j = i + 1; j < inputValues.length; j++) {
				
				String inputValuesLeft  = null;
				String inputValuesRight = null;
				//오름
				if (setNumber == 1) {
					inputValuesLeft = inputValues[i];
					inputValuesRight = inputValues[j];
				//내림
				}else if (setNumber == 2) {
					inputValuesLeft = inputValues[j];
					inputValuesRight = inputValues[i];
				}
				//첫번째 자리 비교
				if (inputValuesLeft.charAt(0) > inputValuesRight.charAt(0)) {
					index = j;
					//첫번째 자리가 같다면 길이 비교
				}else if (inputValues[i].charAt(0) == inputValues[j].charAt(0)) {
					if (inputValues[i].length() > inputValues[j].length()) {
						tmp = inputValues[j].length();
					}else {
						tmp = inputValues[i].length();
					}
					//비교한 길이 중 짧은 걸로 문자열 비교
					for (int z = 0; z < tmp; z++) {
						if (inputValuesLeft.charAt(z) > inputValuesRight.charAt(z)) {
							index = j;
							break;
						}else if (inputValuesLeft.length() > inputValuesRight.length()) {
							index = j;
						}
					}//길이로 비교한 문자열 종료
				}//길이 비교 끝
			}//비교 끝
			temp = inputValues[i];
			inputValues[i] = inputValues[index];
			inputValues[index] = temp;
		}//정렬 끝
	}
}
