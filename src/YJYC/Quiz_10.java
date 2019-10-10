import java.util.Scanner;

public class Quiz_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String	inputValue 	= null;
		char	apb			= 'A';
		int		count		= 0;
		//키보드로부터 문자열 입력
		System.out.print("문자열을 입력하세요 : ");
		inputValue = scn.nextLine();
		
		//입력받은 문자열의 문자 길이
		int sizeOfString = inputValue.length();
		
		//입력받은 문자열의 길이 만큼 char 형 배열 생성
		char charArray[] = new char[sizeOfString];
		
		//문자 나온 횟수 저장
		int countArray[] = new int[52];
		
		//inputValue에 저장된 문자열을 charArray 배열에 복사 : String -> char로 문자열 복사
		inputValue.getChars(0, sizeOfString, charArray, 0);
		
		//입력받은 문자 빈도수 저장하기
		for (int i = 0; i < sizeOfString; i++) {
			apb = 'A';
			for (int j = 0; j < countArray.length; j++) {
				if (apb == 'Z' + 1) 	apb += 6;
			
				if (apb == charArray[i]) 	countArray[j]++;
				
				apb++;
			}
		}
		
		//빈도 출력하기
		apb = 'A';
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] > 0 && count > 0) 	System.out.print(", ");
			
			if (apb == 'Z' + 1) 	apb += 6;
			
			if (countArray[i] > 0) {
				System.out.printf("%c : %d", apb, countArray[i]);
				count++;
			}
			apb++;
		}
		
		scn.close();
	}
}
