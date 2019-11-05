package inJo;

import java.util.Scanner;

public class Quiz_18 {

	static int[][]	matrix;		
	static int[][]	saveMatrix;	 
	static int		size;
	static int		saveCount;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("����� �Է��ϼ���.");
		size = scn.nextInt();

		while(size > 8 || size < 2) {
			System.out.println("���� 2�̻� 8������ ���� �Է��Ͻÿ�.");
			size = scn.nextInt();
		}
		
		matrix				= new int[size][size];
		saveMatrix			= new int[size][size];
		int		randomRange = size * size;
		int[]	saveNumber	= new int[randomRange + 1];
		int		count		= 0;
		int		choice		= 0;
		
		//�迭�� ���� ����
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j]		= (int)(Math.random() * randomRange) + 1;
				saveMatrix[i][j]	= matrix[i][j];
				saveNumber[count]	= matrix[i][j];
				//�ߺ��� ����
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

		//���
		printMatrix();

		//���α׷� ����
		do {
			System.out.println("\n1) ���������� 90�� ȸ��\n"
					+"2) �������� 90�� ȸ��\n"
					+"3) ���Ϲ���\n"
					+"4) �¿����");
			choice = scn.nextInt();

			switch(choice) {
			case 1:
				right();	//���������� 90��
				break;
			case 2:
				left();		//�������� 90��
				break;
			case 3:
				upDnReversal();		//���Ϲ���
				break;
			case 4:
				lfRgReversal();		//�¿����
				break;
			}

			if (choice < 5 && choice > 0) 	printMatrix();

		} while (choice != 5);

		System.out.println("���α׷� ����");
		scn.close();
	}
	
	//���
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

	//������ 90��
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

	//���� 90��
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

	//���Ϲ���
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

	//�¿����
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
