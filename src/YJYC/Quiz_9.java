import java.util.Scanner;

public class Quiz_9 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		char apb = 'A';
		char[] apbArray = new char[52];
		
		System.out.print("���� ���� �Է��ϼ��� : ");
		int start = scn.nextInt();
		while (start > 52 || start < 1) {
			System.out.print("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��ϼ���!");
			start = scn.nextInt();
		}
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		int end = scn.nextInt();
		int sum = start + end - 1;
		while (sum > 52) {
			System.out.print("��� �� ������ �ʰ� �Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
			end = scn.nextInt();
			sum = start + end - 1;
		}
		
		for (int i = 0; i < apbArray.length; i++) {
			if (apb == 'Z' + 1)		apb += 6;
			
			apbArray[i] = apb;
			apb++;
		}
		
		System.out.print("��� �� : ");
		for (int i = start - 1; i < sum; i++) {
			if (i != start - 1) {
				System.out.print(", ");
			}
			System.out.print(apbArray[i]);
		}
		scn.close();
	}
}
