package break_continue_¿¬½À;

public class break_continue_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum = 0;
		for(num = 1; ; num++) {
			sum += num;
			if(sum >= 100) break;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
