import java.util.Scanner;

public class ExIfElse_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�ѱ��ڸ� �Է����ּ���.");
		String inputValue = scn.nextLine();
		scn.close();
		
		//�ѱ��ڸ� �Է��ߴ��� �Ǻ��ϴ� ����
		if (inputValue.length() == 1) {
			System.out.println("���ϼ̽��ϴ�.");
		}else {
			System.out.println("���ϼ̽��ϴ�.");
		}
	}
}
