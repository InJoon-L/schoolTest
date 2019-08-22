package test;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {

		int[]	var		= {3,5,6,7,2};
		char[]	word	= {'s','i','x'};	
		int[]	tmp		= new int[var.length*2];
		
		//for문을 이용한 배열복사 System.arraycopy()보다 느리고 비효율적이다
		for (int i = 0; i < var.length; i++) tmp[i] = var[i];
		var = tmp;
		
		//효율적인 배열복사
		System.arraycopy(var, 0, tmp, 0, var.length);
		
		System.out.println(Arrays.toString(tmp));
		
		for (int each : var) {
			System.out.print(each + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(var));
		System.out.println(Arrays.toString(word));
		System.out.println(var);
		System.out.println(word);
	}
}	
