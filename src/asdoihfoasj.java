import java.util.Scanner;

public class asdoihfoasj {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print( "컬럼 개수를 입력하세요 : ");
      int columNumber = scan.nextInt();
      for(int firstNumber = 2 ; firstNumber < 9 ; firstNumber += columNumber) {
         for(int secondNumber = 1; secondNumber < 10; secondNumber++){
            int num = firstNumber;{
               for(int k = 0 ; k < columNumber; k++) {
                  if(num == 10) {break;}
                  System.out.print( num + " * " + secondNumber + " = " + num*secondNumber);
                  num++;
                  System.out.print("\t");
               }
            }
            System.out.println();
         }
         System.out.println("-----------------------------------------------------------------------------------------------");
      }
      scan.close();
   }
}