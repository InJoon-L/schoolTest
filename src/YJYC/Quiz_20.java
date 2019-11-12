package Quiz;

import java.util.Scanner;

public class Quiz_20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("16진수를 입력해 주세요.");
		String   inputValue         = scn.nextLine();
		boolean  flag				= false;
		int      decimalNumber      = 0;	//십진수
		String   binaryNumber		= "";	//이진수
		String   octalNumber        = "";	//팔진수

		do {
			flag = false;
			//16진수가 적절한지 판단
			for (int i = 0; i < inputValue.length(); i++) {
				char tmp = inputValue.charAt(i);
				if ((tmp > 'f' || tmp < 'a') && (tmp >'F' || tmp < 'A') && (tmp > '9' || tmp < '0')) {
					flag = true;
					break;
				}
			}
			//20줄이 넘기면 다시  
			if (inputValue.length() > 20) {
				flag = true;
				System.out.println("문자열의 최대 길이는 20자입니다.");
				inputValue = scn.nextLine();
				continue;
			}
			//적절하지 않다면 실행
			if (flag) {
				System.out.println("유효하지 않은 16진수입니다. 재입력 하세요.");
				inputValue = scn.nextLine();
			} 
		}while (flag);
		//a = 97 A = 65
		//10진수로 변환
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
		//2진수로 변환
		while (decimalTmp > 0) {
			binaryNumber = decimalTmp % 2 + binaryNumber;
			decimalTmp /= 2;
		}

		int octalTmp = binaryNumber.length();
		//8진수로 변환
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
		
		System.out.print("이진수: ");
		for (int i = 0; i < binaryNumber.length(); i++) {
			char tmp = binaryNumber.charAt(i);
			System.out.print(tmp);
			if (i % 4 == 3) {
				System.out.print(" ");
			}
		}
		System.out.println("\n십진수: " + decimalNumber);
		System.out.println("팔진수: " + octalNumber);
		scn.close();
	}
}