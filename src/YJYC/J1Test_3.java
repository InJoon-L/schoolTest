package JavaTest;

import java.util.Scanner;

public class J1Test_3 {
	
	// <<--	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String 	computerResult 	= null;
		String 	userResult		= null;
		int 	win				= 0;
		int 	lose 			= 0;
		int 	drow 			= 0;
		int		count			= 0;
		int		choice			= 0;
		
		//게임 시작
		do {
			count++;
			//컴퓨터가 1 ~ 3중 랜덤으로 선택
			int computer = (int)(Math.random() * 3) + 1 ;
			System.out.println("가위(1), 바위(2), 보(3)를 입력 하세요");
			//사용자로부터 정수 값을 입력받는다.
			int value = scn.nextInt();
			
			//입력받은 정수 값이 1, 2, 3 중에 없다면 에러 메세지 출력후 다시 입력받는다.
			while (value > 3 || value < 1) {
				System.out.println("\n1, 2, 3 세 가지 중 하나를 입력하세요!");
				value = scn.nextInt();
			}
			
			//컴퓨터가 랜덤으로 선택된 숫자에 맞게 가위, 바위, 보 중 하나를 String값으로 저장
			switch (computer) {
			case 1:
				computerResult = "가위";
				break;
			case 2:
				computerResult = "바위";
				break;
			case 3:
				computerResult = "보";
				break;
			}
			//사용자가 선택한 숫자에 맞게 가위, 바위, 보 중 하나를 String값으로 저장
			switch (value) {
			case 1:
				userResult = "가위";
				break;
			case 2:
				userResult = "바위";
				break;
			case 3:
				userResult = "보";
				break;
			}
			
			//결과값 계산
			int result = value - computer;
			
			//결과 값에 따라 전적을 갱신하고 문구를 출력
			switch (result) {
			case 0:
				System.out.print("\n결과 : 무 ");
				drow++;
				break;
			case -2: case 1:
				System.out.print("\n결과 : 승 ");
				win++;
				break;
			default:
				System.out.print("\n결과 : 패 ");
				lose++;
				break;
			}
			
			//결과와 컴퓨터랑 사용자가 무엇이였는지와 전적을 출력
			System.out.printf("[ 컴퓨터 %s, 사용자 : %s ]\n", computerResult, userResult);
			System.out.printf("%d승 %d패 %d무\n", win, lose, drow);
			
			//게임을 3번 진행했다면 자동으로 게임 종료 
			if (count == 3)		break;
			
			//1번을 누르면 계속 진행 2번을 누르면 게임 종료
			System.out.println("\n계속 하시겠습니까? (예 : 1, 아니요 : 2)");
			choice = scn.nextInt();
		} while (choice != 2);
		
		System.out.println("\n이용해주셔서 감사합니다.");
		scn.close();
		
	}
	
	// -->>
}
