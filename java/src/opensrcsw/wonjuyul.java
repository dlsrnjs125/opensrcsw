package opensrcsw;

public class wonjuyul {
	public static void main( String[] args ) {
		int a = 1;
		double pi = 0;
		for (int i = 0; i < 1000000; i++) {
			if (i % 2 == 1) {
				pi = pi + (double)(1/(double)(i*a));
				a = -a;
			}
		}
		pi = pi*4;
		System.out.println("¿øÁÖÀ² : " + pi);
	}

}
