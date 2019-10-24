import java.util.Scanner;

public class Quiz_15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요.");
		int		stdNumber	= scn.nextInt();
		int	 	sum			= 0;
		float	average		= 0;

		String[][]	stdScore	= new String[stdNumber][7];
		int[][]		saveScore	= new int[stdNumber][2];
		
		//점수 입력후 합계 평균 까지 계산
		for (int i = 0; i < stdNumber; i++) {
			int tmpScore 	= 0;
			sum				= 0;
			average			= 0;
 			stdScore[i][0] = i + 1 + "";
			System.out.println("점수를 국영수 순으로 입력해주세요.");
			for (int j = 0; j < 3; j++) {
				tmpScore = scn.nextInt();
				stdScore[i][j + 1] = tmpScore + "";
				sum += tmpScore;
			}			
			saveScore[i][0] = sum;
			average = (float)sum / 3;
			stdScore[i][4] = sum + "";
			stdScore[i][5] = average + "";
		}
		
		for (int i = 0; i < saveScore.length; i++) {
			saveScore[i][1] = 1;
		}
		
		//등수
		for (int i = 0; i < saveScore.length; i++) {
			for (int j = 0; j < saveScore.length; j++) {
				if (saveScore[i][0] < saveScore[j][0]) {
					saveScore[i][1]++; 
				}
			}
		}
		
		for (int i = 0; i < saveScore.length; i++) {
			stdScore[i][6] = saveScore[i][1] + "";
		}
		
		//정렬
		for (int i = 0; i < stdNumber - 1; i++) {
			for (int j = i; j < stdNumber; j++) {
				if (saveScore[i][1] > saveScore[j][1]) {
					for (int z = 0; z < 7; z++) {
						String tmp = "";
						tmp = stdScore[i][z];
						stdScore[i][z] = stdScore[j][z];
						stdScore[j][z] = tmp;
					}
					
					int tmp = 0;
					tmp = saveScore[i][1];
					saveScore[i][1] = saveScore[j][1];
					saveScore[j][1] = tmp;
				}
			}
		}
		
		//출력
		System.out.println(" 학번 | 국어 | 영어 | 수학 | 합계 | 평균 | 등수");
		for (int i = 0; i < stdNumber; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.printf("%3.4s |",stdScore[i][j]);
			}
			System.out.println();
		}
		
		
		scn.close();
	}
}
