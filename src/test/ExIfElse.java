import java.util.Scanner;

public class ExIfElse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int myBuyApple = scn.nextInt();
		int appleToBuy = 50;
		scn.close();
		
		//����� ������ �°� ��Դ��� �Ǻ�
		if (appleToBuy == myBuyApple) {
			System.out.println("����� 50�� ��Խ��ϴ�.");
		}else {
			System.out.println("����� 50�� ���缭 ����� ���߽��ϴ�.");
		}
	}
}
