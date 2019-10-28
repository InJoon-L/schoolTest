package inJo;

import java.util.Scanner;

public class Quiz_16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("----------------------\n"
						+" 행렬 사이즈(N)를 입력하세요\n"
						+"----------------------\n");
		int		arraySize			= scn.nextInt();
		int[][] firstnumberArray	= new int[arraySize][arraySize];
		int[][] secondnumberArray	= new int[arraySize][arraySize];
		int[][] resultnumberArray	= new int[arraySize][arraySize];
		//첫번째 행렬 난수값 지정
		for (int i = 0; i < firstnumberArray.length; i++) {
			int tmp = 0;
			for (int j = 0; j < firstnumberArray.length; j++) {
				firstnumberArray[i][j] = (int)(Math.random() * 101);
				//중복값 제거
				for (int z = 0; z < firstnumberArray.length; z++) {
					if (firstnumberArray[i][j] == firstnumberArray[tmp][z] && j != z) {
						j--;
						break;
					}
				}
				if (tmp < i)	tmp++;
			}
		}
		//두번째 행렬 난수값 지정
		for (int i = 0; i < secondnumberArray.length; i++) {
			int tmp = 0;
			for (int j = 0; j < secondnumberArray.length; j++) {
				secondnumberArray[i][j] = (int)(Math.random() * 101);
				//중복값 제거
				for (int z = 0; z < secondnumberArray.length; z++) {
					if (secondnumberArray[i][j] == secondnumberArray[tmp][z] && j != z) {
						j--;
						break;
					}
				}
				if (tmp < i)	tmp++;
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
