package opensrcsw;

import java.util.Scanner;

public class gugudan {
	 public static void main( String[] args ) {
		 System.out.print("���ϴ� ���� �Է��ϼ��� : ");
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 for (int i=1; i<10; i++) {
			 System.out.println(a + " * "+ i + " = " + (a*i));
		 }
	 }

}
