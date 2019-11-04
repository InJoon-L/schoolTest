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
		
		//���� ����
		do {
			count++;
			//��ǻ�Ͱ� 1 ~ 3�� �������� ����
			int computer = (int)(Math.random() * 3) + 1 ;
			System.out.println("����(1), ����(2), ��(3)�� �Է� �ϼ���");
			//����ڷκ��� ���� ���� �Է¹޴´�.
			int value = scn.nextInt();
			
			//�Է¹��� ���� ���� 1, 2, 3 �߿� ���ٸ� ���� �޼��� ����� �ٽ� �Է¹޴´�.
			while (value > 3 || value < 1) {
				System.out.println("\n1, 2, 3 �� ���� �� �ϳ��� �Է��ϼ���!");
				value = scn.nextInt();
			}
			
			//��ǻ�Ͱ� �������� ���õ� ���ڿ� �°� ����, ����, �� �� �ϳ��� String������ ����
			switch (computer) {
			case 1:
				computerResult = "����";
				break;
			case 2:
				computerResult = "����";
				break;
			case 3:
				computerResult = "��";
				break;
			}
			//����ڰ� ������ ���ڿ� �°� ����, ����, �� �� �ϳ��� String������ ����
			switch (value) {
			case 1:
				userResult = "����";
				break;
			case 2:
				userResult = "����";
				break;
			case 3:
				userResult = "��";
				break;
			}
			
			//����� ���
			int result = value - computer;
			
			//��� ���� ���� ������ �����ϰ� ������ ���
			switch (result) {
			case 0:
				System.out.print("\n��� : �� ");
				drow++;
				break;
			case -2: case 1:
				System.out.print("\n��� : �� ");
				win++;
				break;
			default:
				System.out.print("\n��� : �� ");
				lose++;
				break;
			}
			
			//����� ��ǻ�Ͷ� ����ڰ� �����̿������� ������ ���
			System.out.printf("[ ��ǻ�� %s, ����� : %s ]\n", computerResult, userResult);
			System.out.printf("%d�� %d�� %d��\n", win, lose, drow);
			
			//������ 3�� �����ߴٸ� �ڵ����� ���� ���� 
			if (count == 3)		break;
			
			//1���� ������ ��� ���� 2���� ������ ���� ����
			System.out.println("\n��� �Ͻðڽ��ϱ�? (�� : 1, �ƴϿ� : 2)");
			choice = scn.nextInt();
		} while (choice != 2);
		
		System.out.println("\n�̿����ּż� �����մϴ�.");
		scn.close();
		
	}
	
	// -->>
}
