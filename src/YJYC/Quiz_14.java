import java.util.Arrays;

public class Quiz_14 {
	public static void main(String[] args) {
		//주사위 3개 던짐
		//규칙 1. 같은 눈이 3개 10000원+같은 눈*1000원의 상금을 받게 된다.
		//규칙 2. 같은 눈이 2개 1000원+같은 눈*100원의 상금을 받게 된다.
		//규칙 3. 모두 다른 눈 그 중 가장 큰 눈*100원의 상금을 받게 된다.
		
		int[]	diceNumber 	= new int[3];
		int		sameNumber 	= 1;
		int		money		= 0;
		int		sameIndex	= 0;
		//주사위 숫자 설정
		for (int i = 0; i < diceNumber.length; i++) {
			diceNumber[i] = (int)(Math.random() * 6) + 1;
		}
		
		//오름차순 정렬
		Arrays.sort(diceNumber);
		
		//비교해서 같은 눈이 몇개 인지 판별
		for (int i = 0; i < diceNumber.length; i++) {
			for (int j = i + 1; j < diceNumber.length; j++) {
				if (diceNumber[i] == diceNumber[j]) {
					sameNumber++;
					sameIndex = i;
				}
			}
			if (sameNumber > 3) 	sameNumber = 3; 
		}
		
		//같은 눈의 갯수의 따라 상금 금액
		switch (sameNumber) {
		case 1:
			money = diceNumber[2] * 100;
			break;
		case 2:
			money = 1000 + diceNumber[sameIndex] * 100;
			break;
		case 3:
			money = 10000 + diceNumber[sameIndex] * 1000;
			break;
		}
		for (int i : diceNumber) {
			System.out.print("주사위 수 : "+ i + " ");
		}
		
		System.out.println("\n상금은 " + money + "입니다.");
	}
}
