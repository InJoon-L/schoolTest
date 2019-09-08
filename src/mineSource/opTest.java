package starTest;

import java.util.Scanner;

public class opTest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float avgSpeed		= 0; //평균속도
		float distance		= 0; //주행거리
		float distanceHour	= 0; //주행시간
		
		//평균속도를 입력 받는다
		System.out.println("평균속도를 입력하세요! <km/h>");
		avgSpeed = scn.nextFloat();
		
		//주행거리를 입력 받는다
		System.out.println("주행거리를 입력하세요! <km/h>");
		distance = scn.nextFloat();
		
		//주행시간 = 주행한거리 / 평균속도 를 구한다
		distanceHour = distance / avgSpeed;
		
		System.out.printf("주행시간: %.4f", distanceHour);
		scn.close();
	}
}
