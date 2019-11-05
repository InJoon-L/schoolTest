package inJo;

import java.util.Scanner;

public class Quiz_18 {

	static int[][]	matrix;		
	static int[][]	saveMatrix;	 
	static int		size;
	static int		saveCount;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("사이즈를 입력하세요.");
		size = scn.nextInt();

		while(size > 8 || size < 2) {
			System.out.println("에러 2이상 8이하의 값을 입력하시오.");
			size = scn.nextInt();
		}
		
		matrix				= new int[size][size];
		saveMatrix			= new int[size][size];
		int		randomRange = size * size;
		int[]	saveNumber	= new int[randomRange + 1];
		int		count		= 0;
		int		choice		= 0;
		
		//배열에 값을 저장
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j]		= (int)(Math.random() * randomRange) + 1;
				saveMatrix[i][j]	= matrix[i][j];
				saveNumber[count]	= matrix[i][j];
				//중복값 제거
				for (int z = 0; z < saveNumber.length; z++) {
					if (matrix[i][j] == saveNumber[z] && count != z) {
						j--;
						count--;
						break;
					}
				}
				count++;
			}
		}

		//출력
		printMatrix();

		//프로그램 실행
		do {
			System.out.println("\n1) 오른쪽으로 90도 회전\n"
					+"2) 왼쪽으로 90도 회전\n"
					+"3) 상하반전\n"
					+"4) 좌우반전");
			choice = scn.nextInt();

			switch(choice) {
			case 1:
				right();	//오른쪽으로 90도
				break;
			case 2:
				left();		//왼쪽으로 90도
				break;
			case 3:
				upDnReversal();		//상하반전
				break;
			case 4:
				lfRgReversal();		//좌우반전
				break;
			}

			if (choice < 5 && choice > 0) 	printMatrix();

		} while (choice != 5);

		System.out.println("프로그램 종료");
		scn.close();
	}
	
	//출력
	static void printMatrix() {
		System.out.println();
		if (saveCount % 2 == 1) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					System.out.printf("%d\t",saveMatrix[i][j]);
				}
				System.out.println();
			}
		}else {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					System.out.printf("%d\t",matrix[i][j]);
				}
				System.out.println();
			}
			
		}
	}

	//오른쪽 90도
	static void right() {
		int tmp = size;
		for (int i = 0; i < matrix.length; i++) {
			tmp--;
			if (saveCount % 2 != 1) {
				for (int j = 0; j < matrix.length; j++) {
					saveMatrix[j][tmp] = matrix[i][j];
				}
			}else {
				for (int j = 0; j < matrix.length; j++) {
					matrix[j][tmp] = saveMatrix[i][j];
				}
			} 
		}
		saveCount++;
	}

	//왼쪽 90도
	static void left() {
		int tmp = size;
		for (int i = 0; i < matrix.length; i++) {
			tmp--;
			if (saveCount % 2 != 1) {
				for (int j = 0; j < matrix.length; j++) {
					saveMatrix[tmp][j] = matrix[j][i];
				}
			}else {
				for (int j = 0; j < matrix.length; j++) {
					matrix[tmp][j] = saveMatrix[j][i];
				}
			} 
		}
		saveCount++;
	}

	//상하반전
	static void upDnReversal() {
		int tmp = size;
		for (int i = 0; i < matrix.length; i++) {
			tmp--;
			if (saveCount % 2 != 1) {
				for (int j = 0; j < matrix.length; j++) {
					saveMatrix[tmp][j] = matrix[i][j];
				}
			}else {
				for (int j = 0; j < matrix.length; j++) {
					matrix[tmp][j] = saveMatrix[i][j];
				}
			} 
		}
		saveCount++;
	}

	//좌우반전
	static void lfRgReversal() {
		int tmp = size;
		for (int i = 0; i < matrix.length; i++) {
			tmp--;
			if (saveCount % 2 != 1) {
				for (int j = 0; j < matrix.length; j++) {
					saveMatrix[j][tmp] = matrix[j][i];
				}
			}else {
				for (int j = 0; j < matrix.length; j++) {
					matrix[j][tmp] = saveMatrix[j][i];
				}
			} 
		}
		saveCount++;
	}
}
