import java.util.Scanner;

public class Quiz_6 {
	public static void main(String[] args) {
		//Ű����κ��� 1~9 ������ ���� �� 10�� �Է�
		//�Է� ���� ���� �迭�� �����϶�
		//�Է� ���� ���� 1~9 ���� ���� ���� �ƴ� ��� Error Msg. ��� �� ���Է�
		//�Է� ���� ���鿡 ���� �Է� �󵵸� ��� ��, �Ʒ� ��� ������׷��� ����϶�.
		//�迭 2�� ���� ���� count�� �ϳ�
		
		Scanner scn = new Scanner(System.in);
		//���ڰ� ��� ���Դ��� ����
		int[]	countArray 		= new int[9];
		int[]	inputValueArray = new int[10];
		int 	inputValue 		= 0;
		int		count			= 0;
		System.out.println("���� 1~9 ������ ���� �� 10�� �Է�");
		//�迭�� �Է¹��� ���ڵ� �����ϱ� 
		for (int i = 0; i < inputValueArray.length; i++) {
	
			inputValue = scn.nextInt();
			//��ȿ�� �˻� 1~9 ������ ������ �ƴϸ� �ٽ� �Է¹���
			while (inputValue > 9 || inputValue < 1) {
				System.out.println("Error ���� 1~9 ������ ������ �Է�");
				inputValue = scn.nextInt();
			}
			inputValueArray[i] = inputValue;
		}
		
		//�迭�� ����� ������ ��� �ִ��� Ȯ������
		for (int i = 0; i < countArray.length; i++) {
			for (int j = 0; j < inputValueArray.length; j++) {
				if (i + 1 == inputValueArray[j]) {
					countArray[i]++;
				}
			}
		}
		//�Է� �� �������
		System.out.println();
		System.out.print("�Է� �� : ");
		for (int i = 0; i < inputValueArray.length; i++) {
			System.out.print(inputValueArray[i]);
			if (i != inputValueArray.length-1) {
				System.out.print(",");
			}
		}
		//�Է� �� ���
		System.out.println();
		System.out.println();
		System.out.println("�Է� ��");
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] > 0) {
				count++;
				System.out.printf("%d) %d : %dȸ%n",count , i + 1, countArray[i]);
			}
		}
		System.out.println();
		System.out.println("������׷�");
		for (int i = inputValueArray.length + 2; i > 0; i--) {
			if (i - 2 < 10 && i % 2 == 0 && i - 2 != 0) {
				System.out.printf("\t%d\t|", i - 2);
			} else if (i - 2 != 0){
				System.out.printf("\t\t|");
			}
			for (int j = 0; j < inputValueArray.length + 2; j++) {
				if (i - 2 == 0) {
					System.out.printf("\t-");
				} else if (i - 2 == -1 && j < 9) {
					System.out.printf("\t%d", j+1);
				} else if (j < 9 && i - 2 <= countArray[j]) {
					System.out.print("\t$");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
		scn.close();
	}
}
