
public class Quiz_5s {
	public static void main(String[] args) {
		//������ �ݰ� ������ ���
		char alphabet = ' ';
		final int totalLine = 52;

		for (int i = 0; i < totalLine; i++) {
			alphabet = 'A';
			
			if (i < 27) {
				for (int j = 0; j < i; j++) {
					System.out.print(alphabet);
					alphabet++;
				}
			}else {
				for (int j = 0; j < totalLine - i; j++) {
					System.out.print(alphabet);
					alphabet++;
				}
			}
			System.out.println();
		}
	}
}
