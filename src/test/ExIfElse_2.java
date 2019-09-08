import java.util.Scanner;

public class ExIfElse_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("한글자만 입력해주세요.");
		String inputValue = scn.nextLine();
		scn.close();
		
		//한글자만 입력했는지 판별하는 내용
		if (inputValue.length() == 1) {
			System.out.println("잘하셨습니다.");
		}else {
			System.out.println("못하셨습니다.");
		}
	}
}
