import java.util.Scanner;

public class Quiz_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String	inputValue	= null;
		char	apb			= 'A';
		int		apbCount	= 0;
		int		stringCount = 0;

		System.out.println("문자를 입력하세요!!");
		//키보드로부터 문자열 입력
		inputValue = scn.nextLine();
		System.out.println("------------------------------------\n");
		
		//입력받은 문자열의 문자 길이
		int sizeOfString = inputValue.length();
		
		//입력받은 문자열의 길이 만큼 char 형 배열 생성
		char charArray[] = new char[sizeOfString];
		
		//inputValue에 저장된 문자열을 charArray 배열에 복사 : String -> char로 문자열 복사
		inputValue.getChars(0, sizeOfString, charArray, 0);
		
		//영문자 개수 세기
		for (int i = 0; i < sizeOfString; i++) {
			apb = 'A';
			for (int j = 0; j < 52; j++) {
				if (apb == 'Z' + 1) 	apb += 6;
				if (charArray[i] == apb) {
					apbCount++;
					break;
				}
				apb++;
			}
		}
		
		//단어 구분해서 단어 개수 세기
		for (int i = 0; i < sizeOfString; i++) {
			if (charArray[i] == ' ') 	stringCount++;
			if (stringCount == 1)		stringCount++; 	
		}
		
		System.out.printf("단어는 총 %d자, 영문자는 %d자 입니다\n\n"
						+ "컴정 일본 IT기업 주문반 화이팅!! ^__^", stringCount, apbCount);
		scn.close();
	}
}
