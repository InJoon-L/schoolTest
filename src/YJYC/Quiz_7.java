package Quiz;
import java.util.Scanner;

public class Quiz_7 { // �ʹ�԰�ʹ� �ʹ���� 
	public static void main(String[] args) {
		//���ڿ� �迭�� ũ��
		final int    MAX_SIZE = 30;

		//Ű����κ��� �Է� ���� ���ڿ� ����
		String      inputValues 	= null;
		//ã�� ���ڿ��� � �ִ��� ����
		int         count       = 0;
		//ã�� ���ڿ��� �ִ��� ������ �Ǻ��ϱ� ���� ����
		boolean      flag      = false;
		
		//Ű����κ��� �Է� ���� ���ڿ��� Char�� �迭�� ����
		//ã��/�ٲٱ� ��� ������ ���
		char charArray[] = new char[MAX_SIZE];

		//Ű����κ��� ���ڿ��� �Է� �޾� String �� ����
		Scanner scn = new Scanner(System.in);
		System.out.println("30�� �̳� ���ڿ��� �Է��Ͻÿ�.");
		inputValues = scn.nextLine();

		//�Է¹��� ���ڿ��� 30�� �̳����� Ȯ��
		while (inputValues.length() > 30) {
			System.out.println("30�� �̳� ���ڿ��� �Է��Ͻÿ�.");
			inputValues = scn.nextLine();
		}

		//����� ���ڿ��� Char�� array ���� charArray�� ����
		inputValues.getChars(0, inputValues.length(), charArray, 0);

		//����� ���ڰ� ���
		System.out.print("�Է� ���� : ");
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}

		System.out.print("\nã�� ���ڿ� : ");
		inputValues = scn.nextLine();

		//���ϱ� ���� ���� �迭
		char searchArray[] = new char[inputValues.length()];
		inputValues.getChars(0, inputValues.length(), searchArray, 0);
		
		int[] sameNums  = new int[MAX_SIZE];

		//ã�� ���ڿ��� �ִ��� ������ Ȯ��
		for (int i = 0; i < charArray.length - searchArray.length; i++) {
			//ã�� ���ڿ� ũ�⸸ŭ �߶� ����
			String inputString   	= null;
			String searchString 	= null;
			int tmp					= 0;
			
			for (int j = 0; j < searchArray.length; j++) {
				//char���� string������ ��ȯ
				searchString  	 += Character.toString(searchArray[j]);
				inputString      += Character.toString(charArray[i + j]);
				//���� �Է¹����� ���° �ڸ����� �ִ��� ����
				tmp         	 = i + j;
			}
			//���ؼ� ������ �ٲ� ���ڿ��� ���� ������ ���� 
			if (searchString.equals(inputString)) {
				flag			= 	true;
				//�ߺ��� ����ŭ �迭�� ã�� ���ڿ� ���̸� ����
				sameNums[count]	= 	tmp;
				count++;
			}
		}
		//ã�� ���ڿ��� ���� �� ����
		while(flag) {
			//�ٲ� ���ڿ��� �Է�
			System.out.print("�ٲ� ���ڿ� : ");
			
			inputValues = scn.nextLine();
			char changeArray[] = new char[inputValues.length()];
			inputValues.getChars(0, inputValues.length(), changeArray, 0);
			
			System.out.print("��� : ");
			int tmp = 0;	//same �迭�� �ҷ����� ���� �ӽ� ���� 
			//��� ���ڿ��� ����Ѵ�.
			for (int i = 0; i < charArray.length; i++) {
				//���� ���ڿ��� ����ϴٰ� ������ �����ϸ� �ٲ� ���ڿ��� ����Ѵ�.
				if (i > sameNums[tmp] - searchArray.length && i < sameNums[tmp]) {
					for (int j = 0; j < changeArray.length; j++) {
						System.out.print(changeArray[j]);
					}
					//�ߺ��� ���� ���� ��� �����Ű�� ����
					tmp++;
					//�ٲ�� �� �� ���� ������ �����ϱ����� ã�� ���ڿ� ��ŭ �ѱ�� ����
					i = i + searchArray.length;
				}
				System.out.print(charArray[i]);
			}
			break;
		}
		//ã�� ���ڿ��� ���� �� ����
		if (!flag) {
			System.out.println("���:ã�� ���ڿ��� �����ϴ�.");
		}
		
		System.out.println("\n���α׷� ����");

		scn.close();
	}
}