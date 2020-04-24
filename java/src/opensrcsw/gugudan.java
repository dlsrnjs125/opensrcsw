package opensrcsw;

import java.util.Scanner;

public class gugudan {
	 public static void main( String[] args ) {
		 System.out.print("원하는 단을 입력하세요 : ");
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 if (a == 0) {
			 for (int j = 2; j <=9; j++) {
				 System.out.print(j + "단 : ");
				 for (int k =1; k <=9; k++) {
					 System.out.print(j + "*" + k + "=" + (j*k)+ " ");
				 }
				 System.out.println();
			 }
		 }
		 else if (a > 0) {
		 for (int i=1; i<10; i++) {
			 System.out.println(a + " * "+ i + " = " + (a*i));
		 }
		 }
		 else if (a < 0) {
			 System.out.println("구구단 출력 불가");
		 }
	 }

}
