import java.util.Scanner;

public class Quiz_5f {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] 	valueArray 	= new int[5];
		int 	medianValue = 0;
		//�迭�� ���� �Է¹ް� �ùٸ� ���� �ƴϸ� ���� �޽����� �Բ� �ٽ� �Է¹޴´�.
		for (int i = 0; i < valueArray.length; i++) {
			int tmp = scn.nextInt();
			//�ӽú����� ���� ��ȿ�� �˻� for���� ������ �ʿ���⿡ �ȿ��� ����
			while (tmp <= 0) {
				System.out.println("1�̻��� ���� �Է����ּ���");
				tmp = scn.nextInt();
			}
			valueArray[i] = tmp;
		}
		
		System.out.print("Inserted values: ");
		//�迭�� ����� ���� ���
		for (int i = 0; i < valueArray.length; i++) {
			System.out.print(valueArray[i]);
			if (i<4) {
				System.out.print(",");
			}
		}
		//�������� ���� 
		for (int i = 0; i < valueArray.length - 1; i++) {
			//�ӽ������� ���� �ӽú��� for���� ������ �ʿ���⿡ �ȿ��� ����
			int tmp = 0;
			for (int j = i+1; j < valueArray.length; j++) {
				if (valueArray[i] > valueArray[j]) {
					tmp = valueArray[i];
					valueArray[i] = valueArray[j];
					valueArray[j] = tmp;
				}
			}
		}
		System.out.println();
		//�ִ�, �ּڰ� ���
		System.out.print("Maximum value: " + valueArray[4] 
				+ "\nMinmum value: " + valueArray[0] + "\n");
		//Ȧ�� (n+1)/2 	¦�� n/2 
		//�迭�� 0���ʹϱ� n-1�� ������ �ָ� ��
		//�߰��� ���
		if (valueArray.length%2 == 0) {
			medianValue = (valueArray.length - 1) / 2;
			System.out.println("Median value: " + valueArray[medianValue]);
		}else {
			medianValue = valueArray.length / 2;
			System.out.println("Median value: " + valueArray[medianValue]);
		}
		scn.close();
	}
}
