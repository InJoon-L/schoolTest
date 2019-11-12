package Quiz;

import java.util.Scanner;

public class Quiz_20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("16������ �Է��� �ּ���.");
		String   inputValue         = scn.nextLine();
		boolean  flag				= false;
		int      decimalNumber      = 0;	//������
		String   binaryNumber		= "";	//������
		String   octalNumber        = "";	//������

		do {
			flag = false;
			//16������ �������� �Ǵ�
			for (int i = 0; i < inputValue.length(); i++) {
				char tmp = inputValue.charAt(i);
				if ((tmp > 'f' || tmp < 'a') && (tmp >'F' || tmp < 'A') && (tmp > '9' || tmp < '0')) {
					flag = true;
					break;
				}
			}
			//20���� �ѱ�� �ٽ�  
			if (inputValue.length() > 20) {
				flag = true;
				System.out.println("���ڿ��� �ִ� ���̴� 20���Դϴ�.");
				inputValue = scn.nextLine();
				continue;
			}
			//�������� �ʴٸ� ����
			if (flag) {
				System.out.println("��ȿ���� ���� 16�����Դϴ�. ���Է� �ϼ���.");
				inputValue = scn.nextLine();
			} 
		}while (flag);
		//a = 97 A = 65
		//10������ ��ȯ
		for (int i = 0; i < inputValue.length(); i++) {
			char    tmp = inputValue.charAt(i);
			if (tmp >= 'a' && tmp <= 'f') {
				decimalNumber += (tmp - 87) * Math.pow(16, inputValue.length() - i - 1);
			}else if (tmp >= 'A' && tmp <= 'F') {
				decimalNumber += (tmp - 55) * Math.pow(16, inputValue.length() - i - 1);
			}else {
				decimalNumber += (tmp - '0') * Math.pow(16, inputValue.length() - i - 1);
			}
		}

		int decimalTmp = decimalNumber;
		//2������ ��ȯ
		while (decimalTmp > 0) {
			binaryNumber = decimalTmp % 2 + binaryNumber;
			decimalTmp /= 2;
		}

		int octalTmp = binaryNumber.length();
		//8������ ��ȯ
		for (int i = 0; i < binaryNumber.length(); i++) {
			int tmp = 0;
			for (int j = 0; j < 3; j++) {
				octalTmp--;
				if (binaryNumber.charAt(octalTmp) == '1') tmp += Math.pow(2, j);
				if (octalTmp == 0) break;
			}
			octalNumber = tmp + octalNumber;
			if (octalTmp == 0) break;
		}
		
		System.out.print("������: ");
		for (int i = 0; i < binaryNumber.length(); i++) {
			char tmp = binaryNumber.charAt(i);
			System.out.print(tmp);
			if (i % 4 == 3) {
				System.out.print(" ");
			}
		}
		System.out.println("\n������: " + decimalNumber);
		System.out.println("������: " + octalNumber);
		scn.close();
	}
}