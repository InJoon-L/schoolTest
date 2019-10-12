import java.util.Scanner;

public class Quiz_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String	selectedWord	= "Yeungjin";
		String	order			= null;
		char	answerChar[]	= new char[104]; //알파벳 대소문자 합해서 52개이기에 중복 2번까지 생각해서 104개로 지정
		int		answerSaveIndex	= 0;
		int		count			= 0;
		int		stringCount 	= 0;
		int 	comparison 		= 0;
		boolean	check			= true;
		boolean flag			= true;

		//정답단어 문자 길이 획득
		int sizeOfString		= selectedWord.length();
		int	positionalNumber[]	= new int[sizeOfString];

		//정답단어 문자열을 char형 배열에 저장할 배열 생성
		char answerWord[] = new char[sizeOfString];

		//selectedWord에 저장된 문자열을 answerWord 배열에 복사 : String -> char로 문자열 복사
		selectedWord.getChars(0, sizeOfString, answerWord, 0);

		//사용자로부터 입력받은 문자열 저장
		char inputValue[] = new char[sizeOfString];

		//"_"로 초기화
		for (int i = 0; i < sizeOfString; i++) {
			inputValue[i] = '_'; 
		}

		//게임 시작
		do {
			//비교를 위해 실행할 때마다 0으로 초기화 
			for (int i = 0; i < sizeOfString; i++) {
				positionalNumber[i] = 0;
			}
			stringCount = 0;
			comparison	= 0;
			check		= true;
			count++;
			//순서표기
			switch (count) {
			case 1:
				order = "st";
				break;
			case 2:
				order = "nd";
				break;
			case 3:
				order = "rd";
				break;

			default:
				order = "th";
				break;
			}

			System.out.print("Given word :");
			for (int i = 0; i < sizeOfString; i++) {
				System.out.print(inputValue[i] + " ");
			}

			System.out.print("\n\nInput your guess: ");
			answerChar[answerSaveIndex] = scn.next().charAt(0);


			//입력한 문자와 일치한 것이 있다면 그 위치를 저장
			for (int i = 0; i < sizeOfString; i++) {
				if (answerWord[i] == answerChar[answerSaveIndex]) {
					positionalNumber[i]++;
					stringCount++;
				}
			}

			//입력한 문자가 전에 유무 판별
			for (int i = 0; i < count; i++) {
				if (answerChar[i] == answerChar[answerSaveIndex] && i != answerSaveIndex) {
					check = false;
					break;
				}
			}

			//조건에 따른 상황별 문구 출력
			if (stringCount > 0) {
				if (check) {
					System.out.printf("Your guess(at %d%s attempt), %c, is good!\n", count, order, answerChar[answerSaveIndex]);
					//일치하는 문자를 원래 자리에 저장
					for (int i = 0; i < sizeOfString; i++) {
						if (positionalNumber[i] == 1) 	inputValue[i] = answerChar[answerSaveIndex];
					}
				}else {
					System.out.printf("Your guess(at %d%s attempt), %c, was already tried (good)!\n", count, order, answerChar[answerSaveIndex]);
				}
			}else {
				if (check) {
					System.out.printf("Your guess(at %d%s attempt), %c, is wrong!\n", count, order, answerChar[answerSaveIndex]);
				}else {
					System.out.printf("Your guess(at %d%s attempt), %c, was already tried (wrong)!\n", count, order, answerChar[answerSaveIndex]);
				}
			}

			//문자를 전부 맞췄다면 탈출 아니면 다시 반복
			for (int i = 0; i < sizeOfString; i++) {
				if (inputValue[i] != '_') 	comparison++; 	
				if (comparison == sizeOfString) flag = false; 
			}

			answerSaveIndex++;
		} while (flag);

		System.out.printf("\nCongratulations ! Correct answer for word in %d%s attempts !", count, order);
		scn.close();
	}
}