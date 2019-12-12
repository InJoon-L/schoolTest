
public class J1FinalTest_1 {
	public static void main(String[] args) {
		char[][] apb = new char[8][8];	//랜덤으로 넣을 배열
		char[] aid	= new char[26];		//알파벳이 차례대로 나열되있는 배열
		int[] count = new int[26];		//갯수를 세기 위한 배열
		char a = 'a';
		//aid배열에 알파벳을 차례대로 대입
		for (int i = 0; i < aid.length; i++) {
			aid[i] = a;
			a++;
		}
		//랜덤으로 apb배열에 알파벳 대입
		for (int i = 0; i < apb.length; i++) {
			for (int j = 0; j < apb.length; j++) {
				apb[i][j] = (char)('a' + (int)(Math.random() * 26));
			}
		}
		System.out.println("8 X 8, 알파벳 발생 결과");
		//그리고 바로 출력
		for (int i = 0; i < apb.length; i++) {
			for (int j = 0; j < apb.length; j++) {
				System.out.printf("\t%c", apb[i][j]);
			}
			System.out.println();
		}
		//횟수세기
		for (int i = 0; i < apb.length; i++) {
			for (int j = 0; j < apb.length; j++) {
				for (int j2 = 0; j2 < aid.length; j2++) {
					//같다면 알파벳 자리에 맞게 횟수 증가
					if (aid[j2] == apb[i][j]) {
						count[j2]++;
					}
				}
			}
		}
		//최소값 최대값
		int min = 0;
		int max = 0;
		int index = 0;
		int index2 = 0;
		for (int j = 1; j < count.length; j++) {
			//최댓값을 구하기 위해 비교대상이 더 크면 바꾸기
			if (count[index] < count[j]) {
				index = j;
				max = count[index];
				//최솟값을 구하기 위해 비교대상이 더 작으면 바꾸기
			}else if (count[index2] > count[j]) {
				index2 = j;
				min = count[index2];
			}
		}

		int minCount = 0;
		int maxCount = 0;
		//횟수값 겹치는거 찾기
		for (int i = 0; i < count.length; i++) {
			//최솟값이라면 최솟값 횟수 ++
			if (count[i] == min) {
				minCount++;
			}
			//최댓값이라면 최댓값 횟수++
			if (count[i] == max) {
				maxCount++;
			}
		}

		//최소 발생 알파벳 출력
		System.out.print("최소 발생 알파벳\n"
				+" - 발생 빈도 : " + min + "\n"
				+" - 중복 알파벳 개수 : " + minCount + "\n"
				+" - 알파벳 : ");
		boolean flag2 = true; // ,한번 출력안하기 위한 변수
		for (int i = 0; i < count.length; i++) {
			if (count[i] == min) {
				if (flag2) {
					System.out.printf("%c", aid[i]);
					flag2 = false;
				}else {
					System.out.printf(", %c", aid[i]);
				}
			}
		}
		System.out.println();
		//최대 발생 알파벳 출력
		System.out.print("최대 발생 알파벳\n"
				+" - 발생 빈도 : " + max + "\n"
				+" - 중복 알파벳 개수 : " + maxCount + "\n"
				+" - 알파벳 : ");
		boolean flag1 = true; // ,한번 출력안하기 위한 변수
		for (int i = 0; i < count.length; i++) {
			if (count[i] == max) {
				if (flag1) {
					System.out.printf("%c", aid[i]);
					flag1 = false;
				}else {
					System.out.printf(", %c", aid[i]);
				}

			}
		}
		System.out.println();
		
		//줄바꿈 위한 변수 
		int number = 0;
		//오름차순 정렬
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < apb.length; j++) {
				for (int j2 = 0; j2 < apb.length; j2++) {
					//aid 배열은 차례대로 알파벳이 나열되있기 때문에 aid배열을 기준으로 apb배열에서 
					//같은걸 하나하나 찾아내서 출력 그러면 자동으로 오름차순이 완성
					if (aid[i] == apb[j][j2]) {
						System.out.printf("\t%c", apb[j][j2]);
						number++;
						//8번 출력 후 줄 바꿈
						if (number % 8 == 0) {
							System.out.println();
						}
					}
				}
			}
		}
	}
}
