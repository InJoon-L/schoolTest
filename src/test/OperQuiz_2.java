package starTest;

import java.util.Scanner;

public class OperQuiz_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int count			= 0;	//몇 번째인지 횟수를 센다
		int inputNum		= 0;	
		String inputQ		= "";

		
		do {
			inputQ = scn.nextLine();
			char temp = inputQ.charAt(0);
			if (temp == 'q') break;
			else inputNum = Integer.parseInt(inputQ);
			
			
			//양수를 입력받기 
			if (inputNum < 1) {
				System.out.println("1이상의 양수를 입력해주세요.");
				continue;
			}
			count++;
			//짝수 출력
			if (inputNum % 2 == 0 && inputNum != 20000) {
				System.out.printf("%d번째 입력 값은 = %d%n "
								+ "\t짝수입니다.%n", count, inputNum);
				
				if (inputNum % 3 == 0) {
					System.out.println("\t3의 배수입니다.");
				}else if (inputNum % 7 == 0) {
					System.out.println("\t7의 배수입니다.");
				}
			//홀수 출력
			}else if (inputNum != 20000) {
				System.out.printf("%d번째 입력 값은 = %d%n "
								+ "\t홀수입니다.%n", count, inputNum);
				
				if (inputNum % 3 == 0) {
					System.out.println("\t3의 배수입니다.");
				}else if (inputNum % 7 == 0) {
					System.out.println("\t7의 배수입니다.");
				}
			}
		} while (inputNum != 20000);
		System.out.println("이용해주셔서 감사합니다.");
		scn.close();
	}
}
