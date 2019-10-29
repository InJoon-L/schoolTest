package inJo;

import java.util.Scanner;

public class Quiz_17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("행렬 N의 크기를 입력하세요:");
		int 	arraySize	= scn.nextInt();
		int 	number		= 0;
		int 	row			= 0;
		int 	col			= 0;
		int		count		= 0;	// 초반 달팽이행렬에 꺽는 조건을 주기위한 변수
		int		start		= 0;	// 달팽이행렬의 시작점을 정하는 변수
		boolean flag		= false;

		while(arraySize > 10 || arraySize < 2) {
			System.out.println("2이상 10이하의 값을 입력하세요:");
			arraySize = scn.nextInt();
		}

		int[][] snailMatrix = new int[arraySize][arraySize];
		int		cycle		= arraySize * 2 - 1;
		if (arraySize == 2) cycle++;	//사이즈가 2일 때 코드상 사이클이 부족하기 때문에 1을 더해준다.
		
		System.out.println("====================");
		System.out.println("달팽이 행렬의 생성 방향은(1: 시계, 2: 반시계):");
		int direction = scn.nextInt();
		//방향지정
		switch (direction) {
		//시계
		case 1:
			start = 1;
			break;
		//반시계
		case 2: 
			start = 22;
			break;
		}
		System.out.println("------------------------------------");

		//선택한 방향대로 달팽이행렬에 값 지정 
		for (int i = 0; i < cycle; i++) {
			for (int j = 0; j < snailMatrix.length; j++) {
				if (j != arraySize - 1 && !flag) number++;

				snailMatrix[col][row] = number;
				flag = false;

				switch (start % 4) {
				case 1:
					if (count > 0 && snailMatrix[col][row + 1] != 0) {
						flag = true;
						row--;
					}

					if(row != arraySize - 1) row++;
					break;
				case 2:
					if (count > 0 && snailMatrix[col + 1][row] != 0) {
						flag = true;
						col--;
					}

					if(col != arraySize - 1) col++;
					break;
				case 3:
					if (direction == 2) {
						if (snailMatrix[col][row - 1] != 0) {
							flag = true;
							row++;
						}
					}else {
						if (count > 0 && snailMatrix[col][row - 1] != 0) {
							flag = true;
							row++;
						}
					}

					if (row != 0) row--;
					break;
				case 0:
					if (direction == 1) {
						if (snailMatrix[col - 1][row] != 0) {
							flag = true;
							col++;
						}
					}else {
						if (count > 0 && snailMatrix[col - 1][row] != 0) {
							flag = true;
							col++;
						}
					}
					if (col != 0) col--;
					break;
				}

				if (flag) 	break;
			}
			if (direction == 1) start++;
			else				start--;

			if (i > 2) count++;
		}
		//달팽이행렬 출력
		for (int i = 0; i < snailMatrix.length; i++) {
			for (int j = 0; j < snailMatrix.length; j++) {
				System.out.printf("%d\t", snailMatrix[i][j]);
			}
			System.out.println();
		}

		scn.close();
	}
}
