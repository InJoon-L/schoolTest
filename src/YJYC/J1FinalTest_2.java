package Quiz;
import java.util.Scanner;

public class J1FinalTest_2 {
	static int count = 0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//위에 메뉴얼
		String[] a	   = {"입력순번", "학번", "국어", "영어", "수학", "총점", "평균", "순위"};
		//결과
		int[][] result = new int[5][8];
		//지정하기 위한 변수
		int set = 0;
		//성적 시작
		do {
			System.out.print("--------------------------\n"
					+"1. 성적 입력\n"
					+"2. 전체 성적 출력 (평균 기준 내림차순)\n"
					+"3. 학생 조회 후 출력\n"
					+"4. 종료\n"
					+"--------------------------\n"
					+"메뉴 선택 : ");
			set = scn.nextInt();
			
			switch (set) {
			case 1:	//성적 입력
				input(result, a, scn);
				break;
			case 2:	//전체 성적 출력(평균 기준 내림차순)
				output(result, a);
				break;
			case 3: //학생 조회 후 출력
				search(result, a, scn);
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;
			}
		} while (set != 4);
	}
	//성적 입력
	static void input(int[][] arg1, String[] arg2, Scanner scn) {
		int sum = 0; //합계
		int avg = 0; //평균
		
		//입력 순번
		arg1[count][0] = count + 1;
		System.out.println("학번을 입력 하세요:");
		arg1[count][1] = scn.nextInt();
		boolean flag = true; // 같은 학번 비교를 위한 변수
		//같은 학번이 있는지 확인 
		while (flag) {
			int icount = 0; // 같은 학번 비교를 위한 변수
			for (int i = 0; i < count; i++) {
				//같은 학번이 존재하면 for문 탈출
				if (arg1[i][1] == arg1[count][1]) {
					System.out.println("존재하는 학번 입니다. 다시 입력해주세요");
					break;
					//없다면 ++
				}else {
					icount++;
				}
			}
			//count 가 같다면 중복이 없기에 탈출
			if (icount == count) {
				flag = false;
			}else {	//아니면 중복이있기에 다시 입력
				arg1[count][1] = scn.nextInt();
			}
		}
		System.out.println("국어 성적을 입력 하세요");
		arg1[count][2] = scn.nextInt();
		System.out.println("영어 성적을 입력 하세요");
		arg1[count][3] = scn.nextInt();
		System.out.println("수학 성적을 입력 하세요");
		arg1[count][4] = scn.nextInt();
		//합계랑 평균 계산 
		for (int i = 2; i < 5; i++) {
			sum += arg1[count][i];
		}
		avg = sum / 3;
		arg1[count][5] = sum;
		arg1[count][6] = avg;
		//요번에 입력한 값을 출력
		System.out.println("입력 값 :");
		for (int i = 1; i < 7; i++) {
			System.out.printf("%s : %d ", arg2[i], arg1[count][i]);
		}
		System.out.println();
		//순위
		for (int i = 0; i < count + 1; i++) {
			int tmp = 1;
			for (int j = 0; j < count + 1; j++) {
				if (arg1[i][6] < arg1[j][6]) {
					tmp++;
				}
			}
			arg1[i][7] = tmp;
		}
		//평균기준 내림차순
		if (count == 0) {
			arg1[count][7] = 1;
		}
		for (int i = 0; i < count; i++) {
			int index = i;
			int tmp = 1; 
			for (int j = i + 1; j < count + 1; j++) {
				if (arg1[index][6] < arg1[j][6]) {
					index = j;
				}
			}

			for (int j = 0; j < arg2.length; j++) {
				tmp = arg1[i][j];
				arg1[i][j] = arg1[index][j];
				arg1[index][j] = tmp;
			}
		}
		count++;
	}
	//전체 성적 출력(평균 기준 내림차순)
	static void output(int[][] arg1, String[] arg2) {
		//입력 순번이  초기값 0 이라면 입력값 없다는 문구 출력 후 메뉴 출력
		if (arg1[0][0] == 0) {
			System.out.println("입력값이 없습니다.");
			//아니면 출력
		}else {
			for (int i = 0; i < arg2.length; i++) {
				System.out.printf("%s\t", arg2[i]);
			}
			System.out.println();
			for (int i = 0; i < count; i++) {
				for (int j = 0; j < arg2.length; j++) {
					System.out.printf("%d\t", arg1[i][j]);
				}
				System.out.println();
			}
		}
	}
	//학생 조회 후 출력
	static void search(int[][] arg1, String[] arg2, Scanner scn) {
		System.out.println("검색 할 학생의 학번을 입력 하세요");
		boolean b = true;	//조회 할 때 있는 지 없는 지 판별하기 위한 변수
		//기회가 3번이므로 3번 반복
		for (int i = 0; i < 3; i++) {
			int sagasu = scn.nextInt(); //조회 할 학번
			for (int j = 0; j < count; j++) {
				//있다면 출력
				if (arg1[j][1] == sagasu) {
					for (int j2 = 0; j2 < arg2.length; j2++) {
						System.out.printf("%s\t", arg2[j2]);
					}
					System.out.println();
					for (int j2 = 0; j2 < arg2.length; j2++) {
						System.out.printf("%d\t", arg1[j][j2]);
					}
					System.out.println();
					b = false;
				}
			}
			//찾았으면 조회 종료
			if (!b) break;
			
			//없다면 출력
			if (b) {
				if (i < 2) {
					System.out.println("입력하신 학번은 없는 학번입니다. 다시 입력하세요.");
				}else {
					System.out.println("입력하신 학번은 없는 학번입니다. 횟수가 초과되어 메뉴로 돌아갑니다.");
				}
			}
		}
	}
}


