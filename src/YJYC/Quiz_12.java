import java.util.Scanner;

public class Quiz_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String	inputValue	= null;
		char	apb			= 'A';
		int		apbCount	= 0;
		int		stringCount = 0;

		System.out.println("���ڸ� �Է��ϼ���!!");
		//Ű����κ��� ���ڿ� �Է�
		inputValue = scn.nextLine();
		System.out.println("------------------------------------\n");
		
		//�Է¹��� ���ڿ��� ���� ����
		int sizeOfString = inputValue.length();
		
		//�Է¹��� ���ڿ��� ���� ��ŭ char �� �迭 ����
		char charArray[] = new char[sizeOfString];
		
		//inputValue�� ����� ���ڿ��� charArray �迭�� ���� : String -> char�� ���ڿ� ����
		inputValue.getChars(0, sizeOfString, charArray, 0);
		
		//������ ���� ����
		for (int i = 0; i < sizeOfString; i++) {
			apb = 'A';
			for (int j = 0; j < 52; j++) {
				if (apb == 'Z' + 1) 	apb += 6;
				if (charArray[i] == apb) {
					apbCount++;
					break;
				}
				apb++;
			}
		}
		
		//�ܾ� �����ؼ� �ܾ� ���� ����
		for (int i = 0; i < sizeOfString; i++) {
			if (charArray[i] == ' ') 	stringCount++;
			if (stringCount == 1)		stringCount++; 	
		}
		
		System.out.printf("�ܾ�� �� %d��, �����ڴ� %d�� �Դϴ�\n\n"
						+ "���� �Ϻ� IT��� �ֹ��� ȭ����!! ^__^", stringCount, apbCount);
		scn.close();
	}
}
