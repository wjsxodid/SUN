package for_연습;

import java.util.Scanner;

public class for_구구단2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		int count;
		
		for(count = 1; count <= 9; count++) {
			System.out.println(dan + "X" + count + "=" + dan*count);
		}
		
	}

}
