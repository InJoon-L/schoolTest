import java.util.Scanner;

public class Quiz_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String	inputValue 	= null;
		char	apb			= 'A';
		int		count		= 0;
		//Ű����κ��� ���ڿ� �Է�
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		inputValue = scn.nextLine();
		
		//�Է¹��� ���ڿ��� ���� ����
		int sizeOfString = inputValue.length();
		
		//�Է¹��� ���ڿ��� ���� ��ŭ char �� �迭 ����
		char charArray[] = new char[sizeOfString];
		
		//���� ���� Ƚ�� ����
		int countArray[] = new int[52];
		
		//inputValue�� ����� ���ڿ��� charArray �迭�� ���� : String -> char�� ���ڿ� ����
		inputValue.getChars(0, sizeOfString, charArray, 0);
		
		//�Է¹��� ���� �󵵼� �����ϱ�
		for (int i = 0; i < sizeOfString; i++) {
			apb = 'A';
			for (int j = 0; j < countArray.length; j++) {
				if (apb == 'Z' + 1) 	apb += 6;
			
				if (apb == charArray[i]) 	countArray[j]++;
				
				apb++;
			}
		}
		
		//�� ����ϱ�
		apb = 'A';
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] > 0 && count > 0) 	System.out.print(", ");
			
			if (apb == 'Z' + 1) 	apb += 6;
			
			if (countArray[i] > 0) {
				System.out.printf("%c : %d", apb, countArray[i]);
				count++;
			}
			apb++;
		}
		
		scn.close();
	}
}
