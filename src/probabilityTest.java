package starTest;

import java.util.Scanner;

//	j1	1701200	이인준
public class probabilityTest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("num번 -100 ~ 100사이의 난수를 발생.이때 6이 나올 확률 구하기\n"
				+ "난수 발생 횟수<num>을 입력하시오: ");
		int num				= scn.nextInt();
		int count			= 0;
		int numSix 			= 0;
		double probability 	= 0;
		boolean flag		= true;
		
		//num이 음수일 경우 다시 문구출력 및 입력값 받기위한 반복문
		do {
			if (num < 0) {
				System.out.print("num번 -100 ~ 100사이의 난수를 발생.이때 6이 나올 확률 구하기\n"
						+ "난수 발생 횟수<num>을 입력하시오: ");
				num	= scn.nextInt();
			}else flag = false;
		} while(flag); //반복문 끝
		
		//한번 더 사용하기 위해 true로 다시 초기화
		flag = true;
				
		//난수 발생 num번 만큼 반복
		for (int i = 0; i < num; i++) {
			int random = (int)(Math.random()*201-100);  //-100 ~ 100까지 난수
			count++;
			if (random == 6) {
				numSix++;
			}
		} //반복문 끝

		//num번 만큼 반복 했을 때 6이 안 나오면 실행 
		if (numSix == 0) {
			//무한반복으로 6이 나올 때 까지 실행
			do {
				int random = (int)(Math.random()*200-100);
				count++;
				if (random == 6) {
					numSix++;
					flag = false;	//6이 나오면 무한반복문 탈출
				}
			}while(flag); //반복문 끝 
		} 

		scn.close();
		//num번 했을 때 안 나올 때랑 나올 때 조건으로 확률 실행
		if (count == num)	probability = (double)numSix/num;
		else 				probability = (double)numSix/count;

		System.out.printf("%d번 시도, 6이 나온 횟수: %d%n", count == num ? num : count, numSix);
		System.out.printf("확률은 %.4f", probability);
	}
}
