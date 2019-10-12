import java.util.Scanner;

public class Quiz_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] randomValues 	= new int[3];
		int[] inputValues	= new int[3];
		int count 			= 1;
		int strike 			= 0;
		int ball 			= 0;
		int out				= 0;
		//���� ����
		for (int i = 0; i < randomValues.length; i++) {
			randomValues[i] = (int)(Math.random() * 10); 
			for (int j = 0; j < i; j++) {
				//�ߺ��� ����
				if (randomValues[i] == randomValues[j]) 	i--;
			}
		}

		//���� ����
		do {
			ball 	= 0;
			strike 	= 0;
			System.out.println("�õ�Ƚ��: " + count + 
					"\n���� 3���� �Է��ϼ���~~^__^");
			for (int i = 0; i < inputValues.length; i++) {
				inputValues[i] = scn.nextInt();
			}
			
			//���� ���ǿ� ���� strike ball ����
			for (int i = 0; i < inputValues.length; i++) {
				for (int j = 0; j < inputValues.length; j++) {
					if (inputValues[i] == randomValues[j] && i == j) 	strike++;
					else if (inputValues[i] == randomValues[j]) 	ball++;
				}
			}
			//���� ���ǿ� �ϳ��� ���ٸ� out 
			if (strike == 0 && ball == 0) 	out++;

			if (out > 0) {
				System.out.printf("Out: �ƿ� %d��\n", out);
			}else {
				if (strike > 0) {
					System.out.printf("%d Strike ", strike);
				}
				if (ball > 0) {
					System.out.printf("%d Ball", ball);
				}
			}
			System.out.println();
			count++;
		} while (count < 5 && out != 2 && strike != 3);

		//����� ���
		if (strike == 3) {
			System.out.print("������ϴ�.\n"
							+ "�̰�׿�~~~\n"
							+ "������");
			for (int i = 0; i < inputValues.length; i++) {
				System.out.print(randomValues[i] + " ");
			}
			System.out.print(" �Դϴ�.");
		} else if (count == 5) {
			System.out.print("����Ƚ�� �ʰ�\n"
					+ "�Ʊ��~~~���׿�..\n"
					+ "������");
			for (int i = 0; i < inputValues.length; i++) {
				System.out.print(randomValues[i] + " ");
			}
			System.out.print("�Դϴ�.");
		}
		if (out == 2) {
			System.out.print("�ʹ� �� ������ϴ�.\n"
					+ "�Ʊ��~~~���׿�..\n"
					+ "������");
			for (int i = 0; i < inputValues.length; i++) {
				System.out.print(randomValues[i] + " ");
			}
			System.out.print("�Դϴ�.");
		}
		scn.close();
	}
}