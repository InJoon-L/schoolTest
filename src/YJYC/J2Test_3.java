package inJo;

import java.util.Arrays;
import java.util.Scanner;

public class J2Test_3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float	sum			= 0;
		float	average		= 0;
		int		firstRange	= -50;
		int 	secondRange	= -41;
		System.out.println("배열의 개수를 입력하세요.");
		int inputValue = scn.nextInt();
		
		while (inputValue < 1 || inputValue > 100) {
			System.out.println("1 이상 100이하의 값을 입력하세요.");
			inputValue = scn.nextInt();
		}
		
		int[] randomArray = new int[inputValue];
		
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int)(Math.random() * 101) - 50;
			for (int j = 0; j < i; j++) {
				if (randomArray[i] == randomArray[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < randomArray.length; i++) {
			sum += randomArray[i];
			average = sum/inputValue;
		}
		
		System.out.println("배  열 의   개수 : " + randomArray.length);
		System.out.print("배열 내 난수 값 : ");
		for (int i = 0; i < randomArray.length; i++) {
			if (i != 0) 	System.out.print(", ");
			System.out.printf("%d", randomArray[i]);
		}
		Arrays.sort(randomArray);
		System.out.println("\n최     대      값 : " + randomArray[inputValue - 1]);
		System.out.println("최     소      값 : " + randomArray[0]);
		System.out.println("평     균      값 : " + average);
		
		System.out.println("\n히스토그램");
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%4d ~ %4d : ", firstRange, secondRange);
			
			if (secondRange == 49) 	secondRange++;
			for (int j = 0; j < randomArray.length; j++) {
				if (firstRange <= randomArray[j] && secondRange >= randomArray[j]) {
					System.out.print("*");
				}
			}
			
			System.out.println();
			firstRange	+= 10;
			secondRange += 10;
		}
		
		scn.close();
	}
}
