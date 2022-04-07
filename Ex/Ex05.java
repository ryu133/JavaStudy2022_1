package Ex;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		int[]  scores  =  {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for (int i : scores) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
