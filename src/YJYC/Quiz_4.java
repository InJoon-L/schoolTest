package Quiz;

import java.util.Scanner;

public class Quiz_4 {
	public static void main(String[] args) {
		RevPyramid 	reverse = new RevPyramid();
		Scanner 	scn 	= new Scanner(System.in);
		//역피라미드 A -> 1 -> a순서로 출력
		//높이는 입력 받고 2n-1로 피라미드 만들기  
		System.out.print("역 피라미드의 높이를 입력하세요:");
		int pyramidLine = scn.nextInt();
		System.out.println("\n--------------------------------------------------------"
							);
		reverse.pyramid(pyramidLine);
		scn.close();
	}
}
//피라미드 라인에 맞게 출력 
class RevPyramid {
	void pyramid(int line) {
		//줄 바꿈에 따라 출력하는 문구 변화 주는 변수
		int count 		= 1;
		for (int i = 0; i < line; i++) {
			char big = 'A';
			int  num = 	1;
			char min = 'a';
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2 * (line - i) - 1; j++) {
				if (count % 3 == 1) {
					System.out.print(big);
					big++;
				}else if (count % 3 == 2) {
					System.out.print(num);
					num++;
					if (num > 9) {
						num = 0;
					}
				}else {
					System.out.print(min);
					min++;
				}
			}
			
			System.out.println();
			count++;
		}
	}
}


