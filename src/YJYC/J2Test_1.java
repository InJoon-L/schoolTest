package inJo;

public class J2Test_1 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i % 2 == 0) {
					System.out.printf("%d X %d = %d\t", i, j, i*j);
					if (j % 3 == 0) {
						System.out.println();
					}
				}
			}
			if (i % 2 == 0) {
				System.out.println();
			}
		}
	}
}
