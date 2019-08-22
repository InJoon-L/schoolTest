package starTest;

import java.util.Scanner;

public class star_2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("star size? ");
		
		int starSize = scan.nextInt();
		scan.close();
		
		//star top
		for (int i = starSize; i > 0; i--) {
			for (int j = 0; j < starSize-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//star bottom
		for (int i = 1; i < starSize; i++) {
			for (int j = 0; j < starSize-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
