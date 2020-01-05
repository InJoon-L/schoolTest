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
				+"1. ���� �Է�\n"
				+"2. ��ü ���� ��� (�Է� ������� ���)\n"
				+"3. ���� �����ϱ�\n"
				+"4. ����\n"
				+"--------------------------------------\n"
				+"�޴� ���� : ");
		int select = scn.nextInt();

		return select;
	}
	static void insert(Student std[], Scanner scn) {
		System.out.println("�й��� �Է� �ϼ���:");
		std[count].id = scn.nextInt();
		for (int i = 0; i < count; i++) {
			if (std[count].id == std[i].id) {
				System.out.println("�����ϴ� �й��Դϴ�. �ٽ� �Է����ּ���");
				std[count].id = scn.nextInt();
			}
		}
		System.out.println("���� ������ �Է� �ϼ���");
		std[count].kor = scn.nextInt();
		System.out.println("���� ������ �Է� �ϼ���");
		std[count].eng = scn.nextInt();
		System.out.println("���� ������ �Է� �ϼ���");
		std[count].math = scn.nextInt();
		System.out.println("���� ������ �Է� �ϼ���");
		std[count].sci = scn.nextInt();

		std[count].plusSum();
		std[count].plusAvg();
		std[count].input = count + 1;
		System.out.println("�Է� �� :");
		System.out.printf("�й� : %d ���� : %d ���� : %d ���� : %d ���� : %d ���� : %d ��� : %.2f\n",std[count].id, std[count].kor,
				std[count].eng, std[count].math, std[count].sci, std[count].sum, std[count].avg);
		count++;
	}

	static void stdPrint(Student std[], int stdNum) {
		
		System.out.printf("\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", std[stdNum].input, std[stdNum].id, std[stdNum].kor,
				std[stdNum].eng, std[stdNum].math, std[stdNum].sci, std[stdNum].sum, std[stdNum].avg);
	}
	static void allPrint(Student std[]) {
		System.out.printf("\t�Է¼���\t�й�\t����\t����\t����\t����\t����\t���\n");
		for (int i = 0; i < count; i++) {
			stdPrint(std, i);
		}
	}

	static void reInput(Student std[], Scanner scn) {
		System.out.println("���� �� ����� �й��� �Է� �ϼ���");
		for (int i = 0; i < std.length; i++) {
			int searchId = scn.nextInt();
			int stdId = 0;
			boolean flag = false;
			//��
			for (int j = 0; j < count; j++) {
				if (searchId == std[j].id) {
					flag = true;
					stdId = j;
				}
			}
			
			if (flag) {
				System.out.println("���� �� ���� ��ȣ�� �Է��ϼ��� : 1.���� 2.���� 3.���� 4.����");
				int select = scn.nextInt();
				switch(select) {
				case 1:
					System.out.println("���� ������ ���� ������ �Է� �ϼ���");
					std[stdId].kor = scn.nextInt();
					break;
				case 2:
					System.out.println("���� ������ ���� ������ �Է� �ϼ���");
					std[stdId].eng = scn.nextInt();
					break;
				case 3:
					System.out.println("���� ������ ���� ������ �Է� �ϼ���");
					std[stdId].math = scn.nextInt();
					break;
				case 4: 
					System.out.println("���� ������ ���� ������ �Է� �ϼ���");
					std[stdId].sci = scn.nextInt();
					break;
				}
				std[stdId].plusSum();
				std[stdId].plusAvg();
				System.out.println(std[stdId].id + " �л��� ������ �����Դϴ�.");
				System.out.printf("\t�Է¼���\t�й�\t����\t����\t����\t����\t����\t���\n");
				stdPrint(std, stdId);
				break;
			}else {
				System.out.println("�Է��Ͻ� �й��� ���� �й��Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}
}
