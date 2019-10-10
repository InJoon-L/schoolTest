import java.util.Scanner;

public class Quiz_9 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		char apb = 'A';
		char[] apbArray = new char[52];
		
		System.out.print("시작 값을 입력하세요 : ");
		int start = scn.nextInt();
		while (start > 52 || start < 1) {
			System.out.print("잘못 입력 하셨습니다. 다시 입력하세요!");
			start = scn.nextInt();
		}
		
		System.out.print("끝 값을 입력하세요 : ");
		int end = scn.nextInt();
		int sum = start + end - 1;
		while (sum > 52) {
			System.out.print("출력 값 범위를 초과 하였습니다. 다시 입력하세요.");
			end = scn.nextInt();
			sum = start + end - 1;
		}
		
		for (int i = 0; i < apbArray.length; i++) {
			if (apb == 'Z' + 1)		apb += 6;
			
			apbArray[i] = apb;
			apb++;
		}
		
		System.out.print("결과 값 : ");
		for (int i = start - 1; i < sum; i++) {
			if (i != start - 1) {
				System.out.print(", ");
			}
			System.out.print(apbArray[i]);
		}
		scn.close();
	}
}
