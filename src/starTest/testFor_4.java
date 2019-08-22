package starTest;

public class testFor_4 {
	public static void main(String[] args) {
		
		for (int i = 26; i >= 1; i--) {
			char big = 'A';
			for (int j = i; j > 0; j--) {
				System.out.print(big++);  
			}
			System.out.println();
		}
	}
}
