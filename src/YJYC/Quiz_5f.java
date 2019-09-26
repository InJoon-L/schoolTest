import java.util.Scanner;

public class Quiz_5f {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] 	valueArray 	= new int[5];
		int 	medianValue = 0;
		//배열에 값을 입력받고 올바른 값이 아니면 오류 메시지와 함께 다시 입력받는다.
		for (int i = 0; i < valueArray.length; i++) {
			int tmp = scn.nextInt();
			//임시변수로 먼저 유효성 검사 for문이 끝나면 필요없기에 안에다 선언
			while (tmp <= 0) {
				System.out.println("1이상의 값을 입력해주세요");
				tmp = scn.nextInt();
			}
			valueArray[i] = tmp;
		}
		
		System.out.print("Inserted values: ");
		//배열에 저장된 값을 출력
		for (int i = 0; i < valueArray.length; i++) {
			System.out.print(valueArray[i]);
			if (i<4) {
				System.out.print(",");
			}
		}
		//오름차순 정렬 
		for (int i = 0; i < valueArray.length - 1; i++) {
			//임시저장을 위한 임시변수 for문을 나가면 필요없기에 안에다 선언
			int tmp = 0;
			for (int j = i+1; j < valueArray.length; j++) {
				if (valueArray[i] > valueArray[j]) {
					tmp = valueArray[i];
					valueArray[i] = valueArray[j];
					valueArray[j] = tmp;
				}
			}
		}
		System.out.println();
		//최댓값, 최솟값 출력
		System.out.print("Maximum value: " + valueArray[4] 
				+ "\nMinmum value: " + valueArray[0] + "\n");
		//홀수 (n+1)/2 	짝수 n/2 
		//배열은 0부터니까 n-1을 적용해 주면 끝
		//중간값 출력
		if (valueArray.length%2 == 0) {
			medianValue = (valueArray.length - 1) / 2;
			System.out.println("Median value: " + valueArray[medianValue]);
		}else {
			medianValue = valueArray.length / 2;
			System.out.println("Median value: " + valueArray[medianValue]);
		}
		scn.close();
	}
}
