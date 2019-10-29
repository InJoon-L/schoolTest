package inJo;

import java.util.Scanner;

public class Quiz_17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("��� N�� ũ�⸦ �Է��ϼ���:");
		int 	arraySize	= scn.nextInt();
		int 	number		= 0;
		int 	row			= 0;
		int 	col			= 0;
		int		count		= 0;	// �ʹ� ��������Ŀ� ���� ������ �ֱ����� ����
		int		start		= 0;	// ����������� �������� ���ϴ� ����
		boolean flag		= false;

		while(arraySize > 10 || arraySize < 2) {
			System.out.println("2�̻� 10������ ���� �Է��ϼ���:");
			arraySize = scn.nextInt();
		}

		int[][] snailMatrix = new int[arraySize][arraySize];
		int		cycle		= arraySize * 2 - 1;
		if (arraySize == 2) cycle++;	//����� 2�� �� �ڵ�� ����Ŭ�� �����ϱ� ������ 1�� �����ش�.
		
		System.out.println("====================");
		System.out.println("������ ����� ���� ������(1: �ð�, 2: �ݽð�):");
		int direction = scn.nextInt();
		//��������
		switch (direction) {
		//�ð�
		case 1:
			start = 1;
			break;
		//�ݽð�
		case 2: 
			start = 22;
			break;
		}
		System.out.println("------------------------------------");

		//������ ������ ��������Ŀ� �� ���� 
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
		//��������� ���
		for (int i = 0; i < snailMatrix.length; i++) {
			for (int j = 0; j < snailMatrix.length; j++) {
				System.out.printf("%d\t", snailMatrix[i][j]);
			}
			System.out.println();
		}

		scn.close();
	}
}
