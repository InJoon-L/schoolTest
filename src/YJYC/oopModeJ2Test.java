package Oop;

import java.util.Scanner;

class Student {
	int input;
	int id;
	int kor;
	int eng;
	int math;
	int sci;
	int sum;
	float avg;

	void plusSum() {
		sum = kor + eng + math + sci;
	}

	void plusAvg() {
		avg = sum/4.0f;
	}
}

public class oopModeJ2Test {
	static int count;
	
	public static void main(String[] args) {
		Student std[] = new Student[3];
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
		}

		int set = 0;
		boolean flag = true;
		do {
			set = menu(scn);
			switch (set) {
			case 1:
				insert(std, scn);
				break;
			case 2:
				allPrint(std);
				break;
			case 3:
				reInput(std, scn);
				break;
			case 4:
				flag = false;
				break;
			}
		} while (flag);
	}

	static int menu(Scanner scn) {
		System.out.print("--------------------------------------\n"
				+"1. 성적 입력\n"
				+"2. 전체 성적 출력 (입력 순서대로 출력)\n"
				+"3. 성적 수정하기\n"
				+"4. 종료\n"
				+"--------------------------------------\n"
				+"메뉴 선택 : ");
		int select = scn.nextInt();

		return select;
	}
	static void insert(Student std[], Scanner scn) {
		System.out.println("학번을 입력 하세요:");
		std[count].id = scn.nextInt();
		for (int i = 0; i < count; i++) {
			if (std[count].id == std[i].id) {
				System.out.println("존재하는 학번입니다. 다시 입력해주세요");
				std[count].id = scn.nextInt();
			}
		}
		System.out.println("국어 성적을 입력 하세요");
		std[count].kor = scn.nextInt();
		System.out.println("영어 성적을 입력 하세요");
		std[count].eng = scn.nextInt();
		System.out.println("수학 성적을 입력 하세요");
		std[count].math = scn.nextInt();
		System.out.println("과학 성적을 입력 하세요");
		std[count].sci = scn.nextInt();

		std[count].plusSum();
		std[count].plusAvg();
		std[count].input = count + 1;
		System.out.println("입력 값 :");
		System.out.printf("학번 : %d 국어 : %d 영어 : %d 수학 : %d 과학 : %d 총점 : %d 평균 : %.2f\n",std[count].id, std[count].kor,
				std[count].eng, std[count].math, std[count].sci, std[count].sum, std[count].avg);
		count++;
	}

	static void stdPrint(Student std[], int stdNum) {
		
		System.out.printf("\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", std[stdNum].input, std[stdNum].id, std[stdNum].kor,
				std[stdNum].eng, std[stdNum].math, std[stdNum].sci, std[stdNum].sum, std[stdNum].avg);
	}
	static void allPrint(Student std[]) {
		System.out.printf("\t입력순번\t학번\t국어\t영어\t수학\t과학\t총점\t평균\n");
		for (int i = 0; i < count; i++) {
			stdPrint(std, i);
		}
	}

	static void reInput(Student std[], Scanner scn) {
		System.out.println("수정 할 삭생의 학번을 입력 하세요");
		for (int i = 0; i < std.length; i++) {
			int searchId = scn.nextInt();
			int stdId = 0;
			boolean flag = false;
			//비교
			for (int j = 0; j < count; j++) {
				if (searchId == std[j].id) {
					flag = true;
					stdId = j;
				}
			}
			
			if (flag) {
				System.out.println("수정 할 과목 번호를 입력하세요 : 1.국어 2.영어 3.수학 4.과학");
				int select = scn.nextInt();
				switch(select) {
				case 1:
					System.out.println("국어 과목의 수정 성적을 입력 하세요");
					std[stdId].kor = scn.nextInt();
					break;
				case 2:
					System.out.println("영어 과목의 수정 성적을 입력 하세요");
					std[stdId].eng = scn.nextInt();
					break;
				case 3:
					System.out.println("수학 과목의 수정 성적을 입력 하세요");
					std[stdId].math = scn.nextInt();
					break;
				case 4: 
					System.out.println("과학 과목의 수정 성적을 입력 하세요");
					std[stdId].sci = scn.nextInt();
					break;
				}
				std[stdId].plusSum();
				std[stdId].plusAvg();
				System.out.println(std[stdId].id + " 학생의 수정된 성적입니다.");
				System.out.printf("\t입력순번\t학번\t국어\t영어\t수학\t과학\t총점\t평균\n");
				stdPrint(std, stdId);
				break;
			}else {
				System.out.println("입력하신 학번은 없는 학번입니다. 다시 입력하세요.");
			}
		}
	}
}
