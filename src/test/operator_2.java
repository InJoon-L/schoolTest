package test;

public class operator_2 {
	public static void main(String[] args) {
		
		int firstNum	= 1;
		int secondNum	= 2;

		float result	= 0;
		
		//연산자의 우선순위는 int보다 float이 우선되어서 int형을 float형으로 변환되기 때문에 소수점이 표시가 된다.
		result = (float)firstNum / secondNum;
		System.out.println(result);
	}
}
