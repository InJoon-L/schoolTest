package Quiz;
import java.util.Scanner;

public class Quiz_7 { // 초밥먹고싶다 초밥사줘 
	public static void main(String[] args) {
		//문자열 배열의 크기
		final int    MAX_SIZE = 30;

		//키보드로부터 입력 받은 문자열 저장
		String      inputValues 	= null;
		//찾는 문자열이 몇개 있는지 저장
		int         count       = 0;
		//찾는 문자열이 있는지 없는지 판별하기 위한 변수
		boolean      flag      = false;
		
		//키보드로부터 입력 받은 문자열을 Char형 배열로 저장
		//찾아/바꾸기 기능 구현시 사용
		char charArray[] = new char[MAX_SIZE];

		//키보드로부터 문자열을 입력 받아 String 형 저장
		Scanner scn = new Scanner(System.in);
		System.out.println("30자 이내 문자열을 입력하시오.");
		inputValues = scn.nextLine();

		//입력받은 문자열이 30자 이내인지 확인
		while (inputValues.length() > 30) {
			System.out.println("30자 이내 문자열을 입력하시오.");
			inputValues = scn.nextLine();
		}

		//저장된 문자열을 Char형 array 변수 charArray에 복사
		inputValues.getChars(0, inputValues.length(), charArray, 0);

		//복사된 문자값 출력
		System.out.print("입력 문장 : ");
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}

		System.out.print("\n찾을 문자열 : ");
		inputValues = scn.nextLine();

		//비교하기 위한 문자 배열
		char searchArray[] = new char[inputValues.length()];
		inputValues.getChars(0, inputValues.length(), searchArray, 0);
		
		int[] sameNums  = new int[MAX_SIZE];

		//찾는 문자열이 있는지 없는지 확인
		for (int i = 0; i < charArray.length - searchArray.length; i++) {
			//찾는 문자열 크기만큼 잘라서 저장
			String inputString   	= null;
			String searchString 	= null;
			int tmp					= 0;
			
			for (int j = 0; j < searchArray.length; j++) {
				//char형을 string형으로 변환
				searchString  	 += Character.toString(searchArray[j]);
				inputString      += Character.toString(charArray[i + j]);
				//원래 입력문장의 몇번째 자리까지 있는지 저장
				tmp         	 = i + j;
			}
			//비교해서 같으면 바꿀 문자열을 위한 변수들 저장 
			if (searchString.equals(inputString)) {
				flag			= 	true;
				//중복된 수만큼 배열에 찾은 문자열 길이를 저장
				sameNums[count]	= 	tmp;
				count++;
			}
		}
		//찾는 문자열이 있을 시 실행
		while(flag) {
			//바꿀 문자열을 입력
			System.out.print("바꿀 문자열 : ");
			
			inputValues = scn.nextLine();
			char changeArray[] = new char[inputValues.length()];
			inputValues.getChars(0, inputValues.length(), changeArray, 0);
			
			System.out.print("결과 : ");
			int tmp = 0;	//same 배열을 불러오기 위한 임시 변수 
			//결과 문자열을 출력한다.
			for (int i = 0; i < charArray.length; i++) {
				//원래 문자열을 출력하다가 조건을 만족하면 바꿀 문자열을 출력한다.
				if (i > sameNums[tmp] - searchArray.length && i < sameNums[tmp]) {
					for (int j = 0; j < changeArray.length; j++) {
						System.out.print(changeArray[j]);
					}
					//중복된 것이 있을 경우 실행시키기 위함
					tmp++;
					//바뀌고 난 후 다음 문장을 실행하기위해 찾은 문자열 만큼 넘기기 위함
					i = i + searchArray.length;
				}
				System.out.print(charArray[i]);
			}
			break;
		}
		//찾는 문자열이 없을 때 실행
		if (!flag) {
			System.out.println("결과:찾는 문자열이 없습니다.");
		}
		
		System.out.println("\n프로그램 종료");

		scn.close();
	}
}