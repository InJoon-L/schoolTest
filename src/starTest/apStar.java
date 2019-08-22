package starTest;

public class apStar {
	public static void main(String[] args) {
		
		final int MAX = 26;
		
		//세로반복
		for (int i = 0; i < MAX; i++) {
			char big = 'A';
			
			//가로반복 조건 만족시 공백
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			//가로반복 조건 만족시 big출력 
			for (int j = 26-i; j > 0; j--) {
				System.out.print(big);
				big++;
			}
			System.out.println();
		}
		
	}
}
