package starTest;

import java.util.Scanner;

//	j1  1701200	이인준
public class diagnoseTest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("1~N까지 7의 배수합 구하기\n"
						+ "양수 N 값을 입력하시오:");
		int endNum			= scn.nextInt();
		int sum				= 0;
		boolean flag		= true;
		
		//100을 처음 넘었을 때의 배수를 한번만 출력하게 하기 위한 변수들
		int firstMultiple	= 0;
		int count			= 0; 
		
		
		//양수 endNum이 범위를 초과 즉 0 또는 -값으로 입력 받았을 시
		//다시 입력하게 하는 반복문
		while (flag) {
			if (endNum < 1) {
				System.out.print("1~N까지 7의 배수합 구하기\n"
						+ "양수 N 값을 입력하시오:");
				endNum = scn.nextInt();
			}else flag = false;
		}//while반복문 끝
		
		//1~endNum까지 7의 배수합을 하는 반복문
		for (int i = 0; i < endNum; i++) {
			int tmp = i + 1; 
			//7의 배수일때만 sum에 더해준다. tmp의 최솟값은 
			//1이므로 0일때는 생각을 안해주어도 된다.
			if (tmp%7 == 0) {
				sum += tmp;
			}
			
			
			//sum이 100을 처음 넘었을 때의 배수를 한번만 출력하기 위한 조건문
			if (sum > 100 && count == 0) {
				firstMultiple = tmp;
				count++;
			}
		}
		scn.close();
		System.out.printf("0~%d까지 7의 배수 합은: %d%n", endNum, sum);
		if (count == 1) {
			System.out.println("누적된 합의 값이 처음으로 100을 넘기는 7의 배수는 " + firstMultiple);
		}
	}
}
