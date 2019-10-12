import java.util.Scanner;

public class Quiz_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String	selectedWord	= "Yeungjin";
		String	order			= null;
		char	answerChar[]	= new char[104]; //���ĺ� ��ҹ��� ���ؼ� 52���̱⿡ �ߺ� 2������ �����ؼ� 104���� ����
		int		answerSaveIndex	= 0;
		int		count			= 0;
		int		stringCount 	= 0;
		int 	comparison 		= 0;
		boolean	check			= true;
		boolean flag			= true;

		//����ܾ� ���� ���� ȹ��
		int sizeOfString		= selectedWord.length();
		int	positionalNumber[]	= new int[sizeOfString];

		//����ܾ� ���ڿ��� char�� �迭�� ������ �迭 ����
		char answerWord[] = new char[sizeOfString];

		//selectedWord�� ����� ���ڿ��� answerWord �迭�� ���� : String -> char�� ���ڿ� ����
		selectedWord.getChars(0, sizeOfString, answerWord, 0);

		//����ڷκ��� �Է¹��� ���ڿ� ����
		char inputValue[] = new char[sizeOfString];

		//"_"�� �ʱ�ȭ
		for (int i = 0; i < sizeOfString; i++) {
			inputValue[i] = '_'; 
		}

		//���� ����
		do {
			//�񱳸� ���� ������ ������ 0���� �ʱ�ȭ 
			for (int i = 0; i < sizeOfString; i++) {
				positionalNumber[i] = 0;
			}
			stringCount = 0;
			comparison	= 0;
			check		= true;
			count++;
			//����ǥ��
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


			//�Է��� ���ڿ� ��ġ�� ���� �ִٸ� �� ��ġ�� ����
			for (int i = 0; i < sizeOfString; i++) {
				if (answerWord[i] == answerChar[answerSaveIndex]) {
					positionalNumber[i]++;
					stringCount++;
				}
			}

			//�Է��� ���ڰ� ���� ���� �Ǻ�
			for (int i = 0; i < count; i++) {
				if (answerChar[i] == answerChar[answerSaveIndex] && i != answerSaveIndex) {
					check = false;
					break;
				}
			}

			//���ǿ� ���� ��Ȳ�� ���� ���
			if (stringCount > 0) {
				if (check) {
					System.out.printf("Your guess(at %d%s attempt), %c, is good!\n", count, order, answerChar[answerSaveIndex]);
					//��ġ�ϴ� ���ڸ� ���� �ڸ��� ����
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

			//���ڸ� ���� ����ٸ� Ż�� �ƴϸ� �ٽ� �ݺ�
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