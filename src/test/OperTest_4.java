package starTest;

public class OperTest_4 {
	public static void main(String[] args) {
		//마름모 출력
		for (int i = 1; i <= 11; i++) {
			//윗부분
			if (i < 7) {
				//공백
				for (int j = 0; j < 6-i; j++) {
					System.out.print(" ");
				}
				//별
				for (int j = 0; j < 2 * i - 1; j++) {
					System.out.print("*");
				}
			//아랫부분
			}else { 
				//공백
				for (int j = 0; j < i - 6; j++) {
					System.out.print(" ");
				}
				//별
				for (int j = 0; j < 2 * (12 - i) - 1; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
