package inJo;

public class Quiz_22 {
	public static void main(String[] args) {
		char value1[] = {'h', 'e', 'l', 'l', 'o'};
		char value2[] = {' ', 'w', 'o', 'r', 'l', 'd'};

		char values[] = concatenate(value1, value2);
		System.out.println(values);
		//-----------------------------------------------------
		boolean resultB = compareTo(
				new String("문자열 1").toCharArray(),
				new String("문자열 2").toCharArray()
				);
		System.out.println(resultB ? "같음" : "다름");
		//-----------------------------------------------------
		int index = indexOf(
				new String("abcdefg").toCharArray(),
				new String("cde").toCharArray()
				);
		System.out.println(index); 
		//-----------------------------------------------------
		char resultC[] = replace(
				new String("abcdefg").toCharArray(),
				new String("cde").toCharArray(),
				new String("k").toCharArray()
				);
		System.out.println(resultC);
	}

	// arg1 + arg2 결과 값 반환 메서드
	public static char [] concatenate(char arg1[], char arg2[]) {
		char[] plus = new char[arg1.length + arg2.length];
		//합치기
		for (int i = 0; i < plus.length; i++) {
			if (i < arg1.length) {
				plus[i] = arg1[i];
			}else {
				plus[i] = arg2[i - arg1.length];
			}
		}
		return plus; 
	}

	// arg1와 arg2 문자열 비교후 
	// 일치 할 경우 "참", 아닐 경우 "거짓" 반환
	public static boolean compareTo(char arg1[], char arg2[]) {
		int 	count  = 0;
		boolean result = false;

		if (arg1.length != arg2.length) {
			result = false;
		}else {
			for (int i = 0; i < arg1.length; i++) {
				if (arg1[i] != arg2[i]) break;
				else 	count++;
			}
		}

		if (count == arg1.length) result = true;

		return result;
	}

	// 문자열 위치 찾기 
	public static int indexOf(char arg1[], char arg2[]) {
		int startIndex = 0;
		int cycle = arg1.length - arg2.length;

		for (int i = 0; i < cycle; i++) {
			int count = 0;

			for (int j = 0; j < arg2.length; j++) {
				if (arg1[j + i] == arg2[j]) count++;
			}

			if (count == arg2.length) {
				startIndex = i;
				break;
			}else {
				startIndex = -1;
			}
		}
		return startIndex;
	}

	// 문자열 치환 
	public static char[] replace(char arg1[], char arg2[], char arg3[]) {
		int cycle = arg1.length - arg2.length;
		int index = 0;
		int argFirst = 0;
		int argThird = 0;
		boolean set = false;

		char changed[] = new char[arg1.length - arg2.length + arg3.length];

		for (int i = 0; i < cycle; i++) {
			int count = 0;

			for (int j = 0; j < arg2.length; j++) {
				if (arg1[j + i] == arg2[j]) count++;
			}

			if (count == arg2.length) {
				set = true;
				index = i;
				break;
			}
		}

		for (int i = 0; i < changed.length; i++) {
			if (i < index || i > index + arg3.length - 1) {
				changed[i] = arg1[argFirst];
				argFirst++;
			}else {
				changed[i] = arg3[argThird];
				argThird++;
				if (argFirst == index) argFirst += arg2.length;	

			}
		}

		return set ? changed : arg1;
	}
}
