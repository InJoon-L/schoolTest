package inJo;

import java.util.Scanner;

public class Quiz_23 {
	static int start;
	static int count;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[][] advanced = new String[5][8];
		do {
			System.out.println("-----------------------\n"
					+"    �� �� �� �� ���α׷�    \n"
					+"-----------------------");
			System.out.println("1. �л����� �Է��ϱ�\n"
					+"2. �л����� ó�� ��� ����ϱ�\n"
					+"3. �������� �������� ����ϱ�\n"
					+"4. ���м��� ���� �ø����� ����ϱ�\n");

			System.out.print("�޴��� �����ϼ���: ");
			int set = scn.nextInt();

			switch (set) {
			case 1:
				scnScore(advanced, scn); //1
				break;
			case 2:
				resultPrint(advanced); //2
				break;
			case 3:
				downSort(advanced); //3
				break;
			case 4:
				upSort(advanced); //4
				break;
			}
		} while (true);
	}
	//���м��� ���� ��������
	static void upSort(String[][] arg1) {
		if (arg1[0][0] == null) {
			System.out.println("�Է� ���� �����ϴ�.");
		}else {
			//����� �迭�� String�̴ϱ� int �迭 �ϳ����� ��������
			int[] saveScore = new int[count];
			//���� �������
			for (int i = 0; i < saveScore.length; i++) {
				saveScore[i] = Integer.parseInt(arg1[i][start - 5]);
			}
			//���� ������
			for (int i = 0; i < saveScore.length - 1; i++) {
				int index	= i;
				int tmp		= 0;
				String temp = null;
				for (int j = i + 1; j < saveScore.length; j++) {
					if (saveScore[index] > saveScore[j]) {
						index = j;
					}
				}
				//���ϴ� ���� ����
				tmp					= saveScore[i];
				saveScore[i]		= saveScore[index];
				saveScore[index]	= tmp;
				//���������� String ����
				for (int j = 0; j < start; j++) {
					temp			= arg1[i][j];
					arg1[i][j]		= arg1[index][j];
					arg1[index][j]	= temp;
				}
			}
			resultPrint(arg1);
		}
	}
	//�������� �������� 
	static void downSort(String[][] arg1) {
		if (arg1[0][0] == null) {
			System.out.println("�Է� ���� �����ϴ�.");
		}else {
			//����� �迭�� String�̴ϱ� int �迭 �ϳ����� ��������
			int[] saveRank = new int[count];
			//���� �������
			for (int i = 0; i < saveRank.length; i++) {
				saveRank[i] = Integer.parseInt(arg1[i][start - 1]);
			}
			//���� ������
			for (int i = 0; i < saveRank.length - 1; i++) {
				int index	= i;
				int tmp		= 0;
				String temp = null;
				for (int j = i + 1; j < saveRank.length; j++) {
					if (saveRank[index] < saveRank[j]) {
						index = j;
					}
				}
				//���ϴ� ���� ����
				tmp				= saveRank[i];
				saveRank[i]		= saveRank[index];
				saveRank[index]	= tmp;
				//���������� String ����
				for (int j = 0; j < start; j++) {
					temp			= arg1[i][j];
					arg1[i][j]		= arg1[index][j];
					arg1[index][j]	= temp;
				}
			}
			resultPrint(arg1);
		}
	}
	//�л����� �Է��ϱ� 
	static void scnScore(String[][] arg1, Scanner scn) {
		start				= arg1[0].length;	
		count				= 0;	//�Է��� �л���
		boolean flag		= false;
		float	avg			= 0;
		float	deviation	= 0;
		float	sumAvg		= 0;

		for (int i = 0; i < arg1.length; i++) {
			System.out.println("�й�, ����, ����, ���� ������ �Է����ּ���.");
			count++;

			for (int j = 0; j < 4; j++) {
				arg1[i][j] = scn.next();

				if (j == 0) {
					int tmp = Integer.parseInt(arg1[i][j]);
					if (tmp == -100) {
						flag = true;
						arg1[i][j] = null;
						count--;
						break;
					}
					//�ߺ��� ����
					for (int z = 0; z < i; z++) {
						if (arg1[z][0].equals(arg1[i][0])) {
							j--;
							System.out.println("�й� �ٽ� �Է��ϼ���.");
							break;
						}
					}
				}
			}
			if (flag) break;
		}
		//�հ�, ���
		for (int i = 0; i < count; i++) {
			int	sum	= 0;

			for (int j = 1; j < 4; j++) {
				int tmp = Integer.parseInt(arg1[i][j]);

				sum += tmp;
			}

			avg = (float)sum / (start - 5);
			arg1[i][start - 4] = sum + "";
			arg1[i][start - 3] = avg + "";
		}
		//����
		for(int i = 0; i < 2; i++) {
			if (sumAvg == 0) {
				for (int j = 0; j < count; j++) {
					sumAvg += Float.parseFloat(arg1[j][start - 3]);
				}
			}else {
				deviation = sumAvg / count;
				for (int j = 0; j < count; j++) {
					float tmp = Float.parseFloat(arg1[j][start - 3]);
					arg1[j][start - 2] = Math.abs(deviation - tmp) + ""; 
				}
			}
		}
		//���� 
		for (int i = 0; i < count; i++) {
			int tmp = 1;
			float bp = Float.parseFloat(arg1[i][start - 3]);

			for (int j = 0; j < count; j++) {
				float temp = Float.parseFloat(arg1[j][start - 3]);
				if (bp < temp) tmp++;
			}

			arg1[i][start - 1] = tmp +"";
		}
	}
	//�л����� ó�� ��� ����ϱ�
	static void resultPrint(String[][] arg1) {
		if (arg1[0][0] == null) {
			System.out.println("�Է� ���� �����ϴ�.");
		}else {
			System.out.println("�й�\t����\t����\t����\t�հ�\t���\t����\t����");
			for (int i = 0; i < count; i++) {
				for (int j = 0; j < arg1[i].length; j++) {
					if (j != start - 2 && j != start -3) {
						System.out.printf("%s\t", arg1[i][j]);
					}else {
						System.out.printf("%.4s\t", arg1[i][j]);
					}
				}
				System.out.println();
			}
		}
	}
}
