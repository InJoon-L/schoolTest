package JavaTest;

import java.util.Scanner;

public class J1Test_1 {
	
	// <<--
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�Է� ��");
		
		//����ڿ��� ������ �����Ѵ�.
		
		int num 	= scn.nextInt();
		char apb 	= 'A';

		//�Է¹��� ������ 0���϶�� ���� �޽��� ��� �� �ٽ� �Է¹޴´�.
		while (num < 1) {
			System.out.println("1�̻� ����� �Է��ϼ���");
			num = scn.nextInt();
		}
		
		System.out.println("\n\n��� ��");
		//�Է¹��� ���� ��ŭ ���ĺ��� ���
		for (int i = 0; i < num; i++) {
			//���ĺ��� Z�� �Ѿ�� �ٽ� A�� �ʱ�ȭ ���ش�.
			if (apb > 'Z') {
				apb = 'A';
			}
			//���ĺ� C, H, K, P�϶� ī���͸� ���ϰ� ������� �ʴ´�.
			if (apb == 'C'|| apb == 'H' || apb == 'K' || apb == 'P') {
				i--;
			//�� ������ �ƴ϶�� ���ĺ��� ����Ѵ�.
			}else {
				//�� �������� ,�� ��� �Ǹ� �ȵ����� �� ó���� ����� �Ƚ�Ű�Ƿν� �������� ����� �Ƚ�ŵ�ϴ�.
				if (i != 0) {
					System.out.print(", ");
				}
				System.out.print(apb);
			}
			apb++;
		}
		scn.close();
	}
	
	// -->>
}
