package starTest;

public class apStar_2 {
	public static void main(String[] args) {
		
		final int MAX		= 52;
		final int SECONDMAX = 26;
		
		//세로반복 0~51까지 1씩 증가
		for (int i = 0; i < MAX; i++) {
			char big = 'A';
			
			//가로반복 0~25까지 big이랑 공백 조건에 따라 출력
			for (int j = 0; j < SECONDMAX; j++) {
				if (i > j && i < 26) {System.out.print(big); big++;}
				else if (i < j && i < 26) {System.out.print(" ");}
				else if (i >= 26 && j - i%SECONDMAX > 24 - (i%SECONDMAX)*2){System.out.print(" ");}
				else {System.out.print(big); big++;}
			}
			System.out.println(); 
		}
	}
}
