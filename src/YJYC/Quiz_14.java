import java.util.Arrays;

public class Quiz_14 {
	public static void main(String[] args) {
		//�ֻ��� 3�� ����
		//��Ģ 1. ���� ���� 3�� 10000��+���� ��*1000���� ����� �ް� �ȴ�.
		//��Ģ 2. ���� ���� 2�� 1000��+���� ��*100���� ����� �ް� �ȴ�.
		//��Ģ 3. ��� �ٸ� �� �� �� ���� ū ��*100���� ����� �ް� �ȴ�.
		
		int[]	diceNumber 	= new int[3];
		int		sameNumber 	= 1;
		int		money		= 0;
		int		sameIndex	= 0;
		//�ֻ��� ���� ����
		for (int i = 0; i < diceNumber.length; i++) {
			diceNumber[i] = (int)(Math.random() * 6) + 1;
		}
		
		//�������� ����
		Arrays.sort(diceNumber);
		
		//���ؼ� ���� ���� � ���� �Ǻ�
		for (int i = 0; i < diceNumber.length; i++) {
			for (int j = i + 1; j < diceNumber.length; j++) {
				if (diceNumber[i] == diceNumber[j]) {
					sameNumber++;
					sameIndex = i;
				}
			}
			if (sameNumber > 3) 	sameNumber = 3; 
		}
		
		//���� ���� ������ ���� ��� �ݾ�
		switch (sameNumber) {
		case 1:
			money = diceNumber[2] * 100;
			break;
		case 2:
			money = 1000 + diceNumber[sameIndex] * 100;
			break;
		case 3:
			money = 10000 + diceNumber[sameIndex] * 1000;
			break;
		}
		for (int i : diceNumber) {
			System.out.print("�ֻ��� �� : "+ i + " ");
		}
		
		System.out.println("\n����� " + money + "�Դϴ�.");
	}
}
