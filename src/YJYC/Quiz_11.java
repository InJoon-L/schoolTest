import java.util.Scanner;

public class Quiz_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] randomValues 	= new int[3];
		int[] inputValues	= new int[3];
		int count 			= 1;
		int strike 			= 0;
		int ball 			= 0;
		int out				= 0;
		//난수 생성
		for (int i = 0; i < randomValues.length; i++) {
			randomValues[i] = (int)(Math.random() * 10); 
			for (int j = 0; j < i; j++) {
				//중복값 제거
				if (randomValues[i] == randomValues[j]) 	i--;
			}
		}

		//게임 시작
		do {
			ball 	= 0;
			strike 	= 0;
			System.out.println("시도횟수: " + count + 
					"\n정수 3개를 입력하세용~~^__^");
			for (int i = 0; i < inputValues.length; i++) {
				inputValues[i] = scn.nextInt();
			}
			
			//맞춘 조건에 따라 strike ball 조정
			for (int i = 0; i < inputValues.length; i++) {
				for (int j = 0; j < inputValues.length; j++) {
					if (inputValues[i] == randomValues[j] && i == j) 	strike++;
					else if (inputValues[i] == randomValues[j]) 	ball++;
				}
			}
			//맞춘 조건에 하나도 없다면 out 
			if (strike == 0 && ball == 0) 	out++;

			if (out > 0) {
				System.out.printf("Out: 아웃 %d번\n", out);
			}else {
				if (strike > 0) {
					System.out.printf("%d Strike ", strike);
				}
				if (ball > 0) {
					System.out.printf("%d Ball", ball);
				}
			}
			System.out.println();
			count++;
		} while (count < 5 && out != 2 && strike != 3);

		//결과값 출력
		if (strike == 3) {
			System.out.print("맞췄습니다.\n"
							+ "이겼네요~~~\n"
							+ "정답은");
			for (int i = 0; i < inputValues.length; i++) {
				System.out.print(randomValues[i] + " ");
			}
			System.out.print(" 입니다.");
		} else if (count == 5) {
			System.out.print("게임횟수 초과\n"
					+ "아까비~~~졌네용..\n"
					+ "정답은");
			for (int i = 0; i < inputValues.length; i++) {
				System.out.print(randomValues[i] + " ");
			}
			System.out.print("입니다.");
		}
		if (out == 2) {
			System.out.print("너무 못 맞췄습니다.\n"
					+ "아까비~~~졌네용..\n"
					+ "정답은");
			for (int i = 0; i < inputValues.length; i++) {
				System.out.print(randomValues[i] + " ");
			}
			System.out.print("입니다.");
		}
		scn.close();
	}
}