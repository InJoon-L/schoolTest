package JavaTest;

import java.util.Scanner;

public class J1Test_2 {
	
	// <<--
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("1�̻� N������ ���� ��, 5�Ǵ� 3�� ����� ��� N���� �Է��ϼ���");
		//����ڷκ��� ���� ���� �Է¹޴´�.
		int num = scn.nextInt();
		
		//�Է¹��� ���� ���� 0���϶�� ���� �޽��� ��� �� �ٽ� �Է¹޴´�.
		while (num < 1) {
			System.out.println("1�̻� ����� �Է��ϼ���");
			num = scn.nextInt();
		}
		
		//����ڷκ��� �Է¹��� ���� ���ʴ�� ���
		for (int i = 1; i <= num; i++) {
			//3�� ����� �� ���
			if (i % 3 == 0) {
				System.out.println("3�� ��� : " + i);
			//5�� ����� �� ���
			}else if (i % 5 == 0) {
				System.out.println("5�� ��� : " + i);
			}
		}
		scn.close();
	}
	
	// -->>
}
