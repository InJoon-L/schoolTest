
import java.util.Scanner;

public class forTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int sum				= 0;
		int count			= 2;
		int result			= 0;
		
		System.out.println("주민등록번호 13자리를 입력해주세요. 입력 시 \"-\"는 생략");
		String reNum = scan.nextLine();
		
		//입력한 주민등록번호가 13자리면 넘어가고 아니면 무한반복으로 13자리 입력까지 반복시킴
		for (;;) {
			if (reNum.length() != 13) {
				System.out.println("잘못입력하였습니다.\n"
						+ "주민등록번호 13자리를 입력해주세요. 입력 시 \"-\"는 생략");
				reNum = scan.nextLine();
			}else {
				break;
			}
		}
			
		//주민번호가 유효한지 안한지 판별 할 수 있는 숫자를 만들어 내기 위한 첫번째 곱셈과 덧셈을 계산
		for (int i = 0; i < 12; i++) {
			
			//곱셈계산 공식에 9를 곱해준 후 다음 숫자가 2부터 다시 순차적으로 오르기 때문에 초기화 
			if (count > 9) count = 2;

			//Character.getNumericValue을 이용해서 문자를 정수값으로 변환 
			//sum += Character.getNumericValue(reNum.charAt(i)) * count; 
			//문자의 코드값 '0'을 뺌으로서 int값으로 받을 때 변함이 없게 하여 곱셈과 덧셈을 동시에 계산
			sum += (reNum.charAt(i) - '0') * count;
			count++;
		}
		
		System.out.println(sum);
		
		//주민번호가 유효한지 안한지 판별 할 수 있는 숫자 최종 단계
		result = 11 - (sum % 11);
		System.out.println(result);
		
		//마지막 13번째 자리숫자가 result와 같으면 유효 아니면 잘못됨
		if (result == reNum.charAt(12)-'0') {
			System.out.println("유효한 주민번호입니다.");
			System.out.println("주민번호: " + reNum);
		}else {
			System.out.println("잘못된 주민번호입니다.");
		}
		
		scan.close();
	}
	
}
