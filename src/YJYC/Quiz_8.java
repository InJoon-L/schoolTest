package Quiz;

import java.util.Scanner;

public class Quiz_8 {
	public static void main(String[] args) {
		//���ڿ� �迭�� ũ�� 
		final int MAX_SIZE = 50;
		
		//���ڿ� ����
		int count 			= 0;
		int danCount 		= 0;
		
		//�������ڿ��� ��� �� �˻� ��������
		int randomDanCount 	= 0;
		
		//int�� ���� 50�� �迭 ����
		int randomValues[] = new int[MAX_SIZE];
		Scanner scn = new Scanner(System.in);
		
		//1 ~ 200 ������ ������ ������ �߻��Ͽ� �迭�� ���� : 50��
		//Math.random() ȣ�� �� 0�̻� 1�̸��� �Ǽ��� �� ��ȯ
		for (int iCount = 0; iCount < MAX_SIZE; iCount++) {
			randomValues[iCount] = (int)((Math.random() * 200 + 1));
			
			//�ߺ��� ���� �߰� �� �� ����
			for (int jCount = 0; jCount < iCount; jCount++) {
				if(randomValues[iCount] == randomValues[jCount]) {
					iCount--;
					break;
				}
			}
		}

		//�߻��� ���� �� ȭ�鿡 ���
		for (int iCount = 0; iCount < MAX_SIZE; iCount++) {
			System.out.print("\t" + randomValues[iCount]);
			count++;
			if (count == 7) {
				System.out.println();
				count = 0;
			}
		}
		
		//��� �� �˻�
		System.out.print("\n\n��� �� �˻� �� ������ �Է��ϼ���(1�̻� ����) ");
		int inputDan = scn.nextInt();
		while (inputDan < 1) {
			System.out.print("Error Msg 1�̻� ������ �Է��ϼ��� ");
			inputDan = scn.nextInt();
		}
		
		//��� �� ���
		System.out.printf("\n\n%d��� ��\n", inputDan);
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
		System.out.printf("\n\n%d ��� �� ���� : %d", inputDan, randomDanCount);
		scn.close();
	}
}
