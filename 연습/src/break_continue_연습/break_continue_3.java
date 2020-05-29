package break_continue_¿¬½À;

public class break_continue_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int count;
		
		for(dan = 2; dan <=9; dan++) {
			if((dan % 2) != 0) continue;
			for(count =1; count <=9; count++) {
				System.out.println(dan + "X" + count + "=" + dan*count);
			}
		}
	}

	}