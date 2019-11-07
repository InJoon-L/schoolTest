package inJo;

import java.util.Arrays;
import java.util.Scanner;
//���� ���� ����
public class Quiz_19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("���л� ���� �Է��ϼ���");
		int		inputValue	= scn.nextInt();
		int		caseCount	= 1;
		//����� �� ���
		for (int i = inputValue; i > 0; i--) {
			caseCount *= i;
		}
		int[]	resultMans	= new int[caseCount];
		int[][]	mans		= new int[caseCount][inputValue];
		//���ϱ� ���� �� 
		System.out.println("�߻� ������ ����� ��: " + caseCount);

		for (int i = 0; i < caseCount; i++) {
			//�������� �ֱ�
			for (int j = 0; j < inputValue; j++) {
				mans[i][j]		= (int)(Math.random() * inputValue) + 1;

				//�ߺ� ����
				for (int z = 0; z < j; z++) {
					if (z != j && mans[i][z] == mans[i][j]) {
						j--;
						break;
					}
				}
			}

			//�ߺ� ���� 
			for (int j = 0; j < i; j++) {
				//�� Ƚ���� ���� �ӽ� ����
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

		//����
		for (int i = 0; i < caseCount; i++) {
			String tmp = "";
			for (int j = 0; j < inputValue; j++) {
				tmp += mans[i][j];
			}
			resultMans[i] = Integer.parseInt(tmp);
		}
		
		Arrays.sort(resultMans);
		
		//���
		for (int i = 0; i < caseCount; i++) {
			System.out.println(resultMans[i]);
		}

		scn.close();
	}
}
