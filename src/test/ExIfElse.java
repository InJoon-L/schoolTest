import java.util.Scanner;

public class ExIfElse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int myBuyApple = scn.nextInt();
		int appleToBuy = 50;
		scn.close();
		
		//사과의 갯수를 맞게 사왔는지 판별
		if (appleToBuy == myBuyApple) {
			System.out.println("사과를 50개 사왔습니다.");
		}else {
			System.out.println("사과를 50개 맞춰서 사오지 못했습니다.");
		}
	}
}
