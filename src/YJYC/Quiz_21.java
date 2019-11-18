package Quiz;

import java.util.Scanner;

public class Quiz_21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("�Է��� ���ڿ��� ����?");

		int stringNumber      = scn.nextInt();
		String[] inputValues   = new String[stringNumber];

		//���ڿ� �Է¹ޱ�
		for (int i = 0; i < inputValues.length; i++) {
			inputValues[i] = scn.next();
			for (int j = 0; j < inputValues[i].length(); j++) {
				char tmp = inputValues[i].charAt(j);
				if (tmp < 'A' || tmp > 'Z') {
					System.out.println("���� �빮�ڸ� �Է��Ͻÿ�.");
					i--;
					break;
				}
			}
		}
		//���ڿ� ���� ���ϱ�
		System.out.println("���� ��� ����? (1) ����, (2) ����");
		int sortSetNumber = scn.nextInt();
		
		sort(inputValues, sortSetNumber);

		for (int i = 0; i < inputValues.length; i++) {
			System.out.println(inputValues[i]);
		}
		
		scn.close();
	}
	
	public static void sort(String[] inputValues, int setNumber) {
		//����
		for (int i = 0; i < inputValues.length - 1; i++) {
			int   	 index   = i;
			int      tmp     = 0;
			String   temp    = null;
			
			for (int j = i + 1; j < inputValues.length; j++) {
				
				String inputValuesLeft  = null;
				String inputValuesRight = null;
				//����
				if (setNumber == 1) {
					inputValuesLeft = inputValues[i];
					inputValuesRight = inputValues[j];
				//����
				}else if (setNumber == 2) {
					inputValuesLeft = inputValues[j];
					inputValuesRight = inputValues[i];
				}
				//ù��° �ڸ� ��
				if (inputValuesLeft.charAt(0) > inputValuesRight.charAt(0)) {
					index = j;
					//ù��° �ڸ��� ���ٸ� ���� ��
				}else if (inputValues[i].charAt(0) == inputValues[j].charAt(0)) {
					if (inputValues[i].length() > inputValues[j].length()) {
						tmp = inputValues[j].length();
					}else {
						tmp = inputValues[i].length();
					}
					//���� ���� �� ª�� �ɷ� ���ڿ� ��
					for (int z = 0; z < tmp; z++) {
						if (inputValuesLeft.charAt(z) > inputValuesRight.charAt(z)) {
							index = j;
							break;
						}else if (inputValuesLeft.length() > inputValuesRight.length()) {
							index = j;
						}
					}//���̷� ���� ���ڿ� ����
				}//���� �� ��
			}//�� ��
			temp = inputValues[i];
			inputValues[i] = inputValues[index];
			inputValues[index] = temp;
		}//���� ��
	}
}
