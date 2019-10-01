import java.util.Scanner;

public class Quiz_6 {
	public static void main(String[] args) {
		//키보드로부터 1~9 사이의 정수 값 10개 입력
		//입력 받은 값을 배열에 저장하라
		//입력 받은 값이 1~9 사이 정수 값이 아닐 경우 Error Msg. 출력 후 재입력
		//입력 받은 값들에 대한 입력 빈도를 계산 후, 아래 양식 히스토그램을 출력하라.
		//배열 2개 쓰자 저장 count값 하나
		
		Scanner scn = new Scanner(System.in);
		//숫자가 몇번 나왔는지 저장
		int[]	countArray 		= new int[9];
		int[]	inputValueArray = new int[10];
		int 	inputValue 		= 0;
		int		count			= 0;
		System.out.println("숫자 1~9 사이의 정수 값 10개 입력");
		//배열에 입력받은 숫자들 저장하기 
		for (int i = 0; i < inputValueArray.length; i++) {
	
			inputValue = scn.nextInt();
			//유효성 검사 1~9 사이의 정수가 아니면 다시 입력받자
			while (inputValue > 9 || inputValue < 1) {
				System.out.println("Error 숫자 1~9 사이의 정수만 입력");
				inputValue = scn.nextInt();
			}
			inputValueArray[i] = inputValue;
		}
		
		//배열에 저장된 값들이 몇번 있는지 확인하자
		for (int i = 0; i < countArray.length; i++) {
			for (int j = 0; j < inputValueArray.length; j++) {
				if (i + 1 == inputValueArray[j]) {
					countArray[i]++;
				}
			}
		}
		//입력 값 출력하자
		System.out.println();
		System.out.print("입력 값 : ");
		for (int i = 0; i < inputValueArray.length; i++) {
			System.out.print(inputValueArray[i]);
			if (i != inputValueArray.length-1) {
				System.out.print(",");
			}
		}
		//입력 빈도 출력
		System.out.println();
		System.out.println();
		System.out.println("입력 빈도");
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] > 0) {
				count++;
				System.out.printf("%d) %d : %d회%n",count , i + 1, countArray[i]);
			}
		}
		System.out.println();
		System.out.println("히스토그램");
		for (int i = inputValueArray.length + 2; i > 0; i--) {
			if (i - 2 < 10 && i % 2 == 0 && i - 2 != 0) {
				System.out.printf("\t%d\t|", i - 2);
			} else if (i - 2 != 0){
				System.out.printf("\t\t|");
			}
			for (int j = 0; j < inputValueArray.length + 2; j++) {
				if (i - 2 == 0) {
					System.out.printf("\t-");
				} else if (i - 2 == -1 && j < 9) {
					System.out.printf("\t%d", j+1);
				} else if (j < 9 && i - 2 <= countArray[j]) {
					System.out.print("\t$");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
		scn.close();
	}
}
