package inJo;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("남학생 수를 입력하세요");
		int		inputValue	= scn.nextInt();
		int		caseCount	= 1;
		//경우의 수 계산
		for (int i = inputValue; i > 0; i--) {
			caseCount *= i;
		}
		int[]	resultMans	= new int[caseCount];
		int[][]	mans		= new int[caseCount][inputValue];
		//비교하기 위한 것 
		System.out.println("발생 가능한 경우의 수: " + caseCount);

		for (int i = 0; i < caseCount; i++) {
			//랜덤으로 넣기
			for (int j = 0; j < inputValue; j++) {
				mans[i][j]		= (int)(Math.random() * inputValue) + 1;

				//중복 제거
				for (int z = 0; z < j; z++) {
					if (z != j && mans[i][z] == mans[i][j]) {
						j--;
						break;
					}
				}
			}

			//중복 제거 
			for (int j = 0; j < i; j++) {
				//비교 횟수를 위한 임시 변수
				int tmp = 0;
				for (int z = 0; z < inputValue; z++) {
					if (i != j && mans[i][z] == mans[j][z]) tmp++;
					if (tmp == inputValue) {
						i--;
						break;
					}
				}
				if (tmp == inputValue) break;
			}
		}

		//정렬
		for (int i = 0; i < caseCount; i++) {
			String tmp = "";
			for (int j = 0; j < inputValue; j++) {
				tmp += mans[i][j];
			}
			resultMans[i] = Integer.parseInt(tmp);
		}
		
		Arrays.sort(resultMans);
		
		//출력
		for (int i = 0; i < resultMans.length; i++) {
			String tmp = "" + resultMans[i];
			for (int j = 0; j < inputValue; j++) {
				char temp = tmp.charAt(j);
				System.out.print(temp + " ");
			}
			System.out.println();
		}

		scn.close();
	}
}
