package inJo;

import java.util.Scanner;

public class Quiz_16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("----------------------\n"
						+" 행렬 사이즈(N)를 입력하세요\n"
						+"----------------------\n");
		int		arraySize			= scn.nextInt();
		int		firstCount			= 0;
		int[][] firstnumberArray	= new int[arraySize][arraySize];
		int[]	firstSaveNumber		= new int[arraySize * arraySize];
		int 	secondCount			= 0;	
		int[][] secondnumberArray	= new int[arraySize][arraySize];
		int[]	secondSaveNumber	= new int[arraySize * arraySize];
		int[][] resultnumberArray	= new int[arraySize][arraySize];
		//첫번째 행렬 난수값 지정
		for (int i = 0; i < firstnumberArray.length; i++) {
			for (int j = 0; j < firstnumberArray.length; j++) {
				firstnumberArray[i][j]	= (int)(Math.random() * 101);
				firstSaveNumber[firstCount]	= firstnumberArray[i][j];
				//중복값 제거
				for (int z = 0; z < firstCount; z++) {
					if (firstnumberArray[i][j] == firstSaveNumber[z]) {
						j--;
						firstCount--;
						break;
					}
				}
				firstCount++;
			}
		}
		//두번째 행렬 난수값 지정
		for (int i = 0; i < secondnumberArray.length; i++) {
			for (int j = 0; j < secondnumberArray.length; j++) {
				secondnumberArray[i][j] = (int)(Math.random() * 101);
				secondSaveNumber[secondCount] 	= secondnumberArray[i][j];
				//중복값 제거
				for (int z = 0; z < secondCount; z++) {
					if (secondnumberArray[i][j] == secondSaveNumber[z]) {
						j--;
						secondCount--;
						break;
					}
				}
				secondCount++;
			}
		}
		
		//두 행렬을 곱셈 
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize; j++) {
				for (int z = 0; z < arraySize; z++) {
					resultnumberArray[i][j] += firstnumberArray[i][z] * secondnumberArray[z][j];
				}
			}
		}
		
		//출력
		System.out.println("----------------------");
		//첫번째 행렬 출력
		for (int i = 0; i < firstnumberArray.length; i++) {
			for (int j = 0; j < firstnumberArray.length; j++) {
				System.out.printf("%d\t", firstnumberArray[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------");
		System.out.println("\tX");
		System.out.println("----------------------");
		
		//두번째 행렬 출력
		for (int i = 0; i < secondnumberArray.length; i++) {
			for (int j = 0; j < secondnumberArray.length; j++) {
				System.out.printf("%d\t", secondnumberArray[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------");
		System.out.println("\t=");
		System.out.println("----------------------");
		
		//결과 값 출력
		for (int i = 0; i < resultnumberArray.length; i++) {
			for (int j = 0; j < resultnumberArray.length; j++) {
				System.out.printf("%d\t", resultnumberArray[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
		scn.close();
	}
}
