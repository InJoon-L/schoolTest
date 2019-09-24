package Quiz;

import java.util.Scanner;

public class Quiz_4 {
	public static void main(String[] args) {
		RevPyramid 	reverse = new RevPyramid();
		Scanner 	scn 	= new Scanner(System.in);
		//���Ƕ�̵� A -> 1 -> a������ ���
		//���̴� �Է� �ް� 2n-1�� �Ƕ�̵� �����  
		System.out.print("�� �Ƕ�̵��� ���̸� �Է��ϼ���:");
		int pyramidLine = scn.nextInt();
		System.out.println("\n--------------------------------------------------------"
							);
		reverse.pyramid(pyramidLine);
		scn.close();
	}
}
//�Ƕ�̵� ���ο� �°� ��� 
class RevPyramid {
	void pyramid(int line) {
		//�� �ٲ޿� ���� ����ϴ� ���� ��ȭ �ִ� ����
		int count 		= 1;
		for (int i = 0; i < line; i++) {
			char big = 'A';
			int  num = 	1;
			char min = 'a';
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2 * (line - i) - 1; j++) {
				if (count % 3 == 1) {
					System.out.print(big);
					big++;
				}else if (count % 3 == 2) {
					System.out.print(num);
					num++;
					if (num > 9) {
						num = 0;
					}
				}else {
					System.out.print(min);
					min++;
				}
			}
			
			System.out.println();
			count++;
		}
	}
}


