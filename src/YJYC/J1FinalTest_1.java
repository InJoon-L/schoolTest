
public class J1FinalTest_1 {
	public static void main(String[] args) {
		char[][] apb = new char[8][8];	//�������� ���� �迭
		char[] aid	= new char[26];		//���ĺ��� ���ʴ�� �������ִ� �迭
		int[] count = new int[26];		//������ ���� ���� �迭
		char a = 'a';
		//aid�迭�� ���ĺ��� ���ʴ�� ����
		for (int i = 0; i < aid.length; i++) {
			aid[i] = a;
			a++;
		}
		//�������� apb�迭�� ���ĺ� ����
		for (int i = 0; i < apb.length; i++) {
			for (int j = 0; j < apb.length; j++) {
				apb[i][j] = (char)('a' + (int)(Math.random() * 26));
			}
		}
		System.out.println("8 X 8, ���ĺ� �߻� ���");
		//�׸��� �ٷ� ���
		for (int i = 0; i < apb.length; i++) {
			for (int j = 0; j < apb.length; j++) {
				System.out.printf("\t%c", apb[i][j]);
			}
			System.out.println();
		}
		//Ƚ������
		for (int i = 0; i < apb.length; i++) {
			for (int j = 0; j < apb.length; j++) {
				for (int j2 = 0; j2 < aid.length; j2++) {
					//���ٸ� ���ĺ� �ڸ��� �°� Ƚ�� ����
					if (aid[j2] == apb[i][j]) {
						count[j2]++;
					}
				}
			}
		}
		//�ּҰ� �ִ밪
		int min = 0;
		int max = 0;
		int index = 0;
		int index2 = 0;
		for (int j = 1; j < count.length; j++) {
			//�ִ��� ���ϱ� ���� �񱳴���� �� ũ�� �ٲٱ�
			if (count[index] < count[j]) {
				index = j;
				max = count[index];
				//�ּڰ��� ���ϱ� ���� �񱳴���� �� ������ �ٲٱ�
			}else if (count[index2] > count[j]) {
				index2 = j;
				min = count[index2];
			}
		}

		int minCount = 0;
		int maxCount = 0;
		//Ƚ���� ��ġ�°� ã��
		for (int i = 0; i < count.length; i++) {
			//�ּڰ��̶�� �ּڰ� Ƚ�� ++
			if (count[i] == min) {
				minCount++;
			}
			//�ִ��̶�� �ִ� Ƚ��++
			if (count[i] == max) {
				maxCount++;
			}
		}

		//�ּ� �߻� ���ĺ� ���
		System.out.print("�ּ� �߻� ���ĺ�\n"
				+" - �߻� �� : " + min + "\n"
				+" - �ߺ� ���ĺ� ���� : " + minCount + "\n"
				+" - ���ĺ� : ");
		boolean flag2 = true; // ,�ѹ� ��¾��ϱ� ���� ����
		for (int i = 0; i < count.length; i++) {
			if (count[i] == min) {
				if (flag2) {
					System.out.printf("%c", aid[i]);
					flag2 = false;
				}else {
					System.out.printf(", %c", aid[i]);
				}
			}
		}
		System.out.println();
		//�ִ� �߻� ���ĺ� ���
		System.out.print("�ִ� �߻� ���ĺ�\n"
				+" - �߻� �� : " + max + "\n"
				+" - �ߺ� ���ĺ� ���� : " + maxCount + "\n"
				+" - ���ĺ� : ");
		boolean flag1 = true; // ,�ѹ� ��¾��ϱ� ���� ����
		for (int i = 0; i < count.length; i++) {
			if (count[i] == max) {
				if (flag1) {
					System.out.printf("%c", aid[i]);
					flag1 = false;
				}else {
					System.out.printf(", %c", aid[i]);
				}

			}
		}
		System.out.println();
		
		//�ٹٲ� ���� ���� 
		int number = 0;
		//�������� ����
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < apb.length; j++) {
				for (int j2 = 0; j2 < apb.length; j2++) {
					//aid �迭�� ���ʴ�� ���ĺ��� �������ֱ� ������ aid�迭�� �������� apb�迭���� 
					//������ �ϳ��ϳ� ã�Ƴ��� ��� �׷��� �ڵ����� ���������� �ϼ�
					if (aid[i] == apb[j][j2]) {
						System.out.printf("\t%c", apb[j][j2]);
						number++;
						//8�� ��� �� �� �ٲ�
						if (number % 8 == 0) {
							System.out.println();
						}
					}
				}
			}
		}
	}
}
