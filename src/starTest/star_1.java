package starTest;

import java.util.Scanner;

public class star_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("별사이즈입력");
		int starSize = scan.nextInt();
		
		//star top 
		for (int i = 0; i < starSize; i++) {
			
			//star top left
			for (int j = 0; j < starSize; j++) {
				if(i >= j)System.out.print("*");
				else System.out.print(" ");
			}
			
			//star top right
			for (int j = starSize; j > 0; j--) {
				if (i+1 >= j) System.out.print("*"); 
				else System.out.print(" ");
				}
			System.out.println();
			}
		
		//star bottom 
		for (int i = 1; i < starSize; i++) {
			
			//star bottom left
			for (int j = starSize; j > 0; j--) {
				if (i >= j) System.out.print(" "); 
				else System.out.print("*");
			}
			
			//star bottom right
			for (int j = 0; j < starSize; j++) {
				if(i > j)System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
	
}