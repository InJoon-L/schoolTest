package inJo;

import java.util.Scanner;

public class Quiz_23 {
	static int start;
	static int count;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[][] advanced = new String[5][8];
		do {
			System.out.println("-----------------------\n"
					+"    성 적 관 리 프로그램    \n"
					+"-----------------------");
			System.out.println("1. 학생성적 입력하기\n"
					+"2. 학생성적 처리 결과 출력하기\n"
					+"3. 순위기준 내림차순 출력하기\n"
					+"4. 수학성적 기준 올림차순 출력하기\n");

			System.out.print("메뉴를 선택하세요: ");
			int set = scn.nextInt();

			switch (set) {
			case 1:
				scnScore(advanced, scn); //1
				break;
			case 2:
				resultPrint(advanced); //2
				break;
			case 3:
				downSort(advanced); //3
				break;
			case 4:
				upSort(advanced); //4
				break;
			}
		} while (true);
	}
	//수학성적 기준 오름차순
	static void upSort(String[][] arg1) {
		if (arg1[0][0] == null) {
			System.out.println("입력 값이 없습니다.");
		}else {
			//저장된 배열이 String이니까 int 배열 하나만들어서 정렬하자
			int[] saveScore = new int[count];
			//값을 집어넣자
			for (int i = 0; i < saveScore.length; i++) {
				saveScore[i] = Integer.parseInt(arg1[i][start - 5]);
			}
			//이제 비교하자
			for (int i = 0; i < saveScore.length - 1; i++) {
				int index	= i;
				int tmp		= 0;
				String temp = null;
				for (int j = i + 1; j < saveScore.length; j++) {
					if (saveScore[index] > saveScore[j]) {
						index = j;
					}
				}
				//비교하는 숫자 정렬
				tmp					= saveScore[i];
				saveScore[i]		= saveScore[index];
				saveScore[index]	= tmp;
				//최종적으로 String 정렬
				for (int j = 0; j < start; j++) {
					temp			= arg1[i][j];
					arg1[i][j]		= arg1[index][j];
					arg1[index][j]	= temp;
				}
			}
			resultPrint(arg1);
		}
	}
	//순위기준 내림차순 
	static void downSort(String[][] arg1) {
		if (arg1[0][0] == null) {
			System.out.println("입력 값이 없습니다.");
		}else {
			//저장된 배열이 String이니까 int 배열 하나만들어서 정렬하자
			int[] saveRank = new int[count];
			//값을 집어넣자
			for (int i = 0; i < saveRank.length; i++) {
				saveRank[i] = Integer.parseInt(arg1[i][start - 1]);
			}
			//이제 비교하자
			for (int i = 0; i < saveRank.length - 1; i++) {
				int index	= i;
				int tmp		= 0;
				String temp = null;
				for (int j = i + 1; j < saveRank.length; j++) {
					if (saveRank[index] < saveRank[j]) {
						index = j;
					}
				}
				//비교하는 숫자 정렬
				tmp				= saveRank[i];
				saveRank[i]		= saveRank[index];
				saveRank[index]	= tmp;
				//최종적으로 String 정렬
				for (int j = 0; j < start; j++) {
					temp			= arg1[i][j];
					arg1[i][j]		= arg1[index][j];
					arg1[index][j]	= temp;
				}
			}
			resultPrint(arg1);
		}
	}
	//학생성적 입력하기 
	static void scnScore(String[][] arg1, Scanner scn) {
		start				= arg1[0].length;	
		count				= 0;	//입력한 학생수
		boolean flag		= false;
		float	avg			= 0;
		float	deviation	= 0;
		float	sumAvg		= 0;

		for (int i = 0; i < arg1.length; i++) {
			System.out.println("학번, 국어, 영어, 수학 순으로 입력해주세요.");
			count++;

			for (int j = 0; j < 4; j++) {
				arg1[i][j] = scn.next();

				if (j == 0) {
					int tmp = Integer.parseInt(arg1[i][j]);
					if (tmp == -100) {
						flag = true;
						arg1[i][j] = null;
						count--;
						break;
					}
					//중복값 제거
					for (int z = 0; z < i; z++) {
						if (arg1[z][0].equals(arg1[i][0])) {
							j--;
							System.out.println("학번 다시 입력하세요.");
							break;
						}
					}
				}
			}
			if (flag) break;
		}
		//합계, 평균
		for (int i = 0; i < count; i++) {
			int	sum	= 0;

			for (int j = 1; j < 4; j++) {
				int tmp = Integer.parseInt(arg1[i][j]);

				sum += tmp;
			}

			avg = (float)sum / (start - 5);
			arg1[i][start - 4] = sum + "";
			arg1[i][start - 3] = avg + "";
		}
		//편차
		for(int i = 0; i < 2; i++) {
			if (sumAvg == 0) {
				for (int j = 0; j < count; j++) {
					sumAvg += Float.parseFloat(arg1[j][start - 3]);
				}
			}else {
				deviation = sumAvg / count;
				for (int j = 0; j < count; j++) {
					float tmp = Float.parseFloat(arg1[j][start - 3]);
					arg1[j][start - 2] = Math.abs(deviation - tmp) + ""; 
				}
			}
		}
		//순위 
		for (int i = 0; i < count; i++) {
			int tmp = 1;
			float bp = Float.parseFloat(arg1[i][start - 3]);

			for (int j = 0; j < count; j++) {
				float temp = Float.parseFloat(arg1[j][start - 3]);
				if (bp < temp) tmp++;
			}

			arg1[i][start - 1] = tmp +"";
		}
	}
	//학생성적 처리 결과 출력하기
	static void resultPrint(String[][] arg1) {
		if (arg1[0][0] == null) {
			System.out.println("입력 값이 없습니다.");
		}else {
			System.out.println("학번\t국어\t영어\t수학\t합계\t평균\t편차\t순위");
			for (int i = 0; i < count; i++) {
				for (int j = 0; j < arg1[i].length; j++) {
					if (j != start - 2 && j != start -3) {
						System.out.printf("%s\t", arg1[i][j]);
					}else {
						System.out.printf("%.4s\t", arg1[i][j]);
					}
				}
				System.out.println();
			}
		}
	}
}
