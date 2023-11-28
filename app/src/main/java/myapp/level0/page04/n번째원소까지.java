package myapp.level0.page04;

import java.util.Arrays;

public class n번째원소까지 {
	public int[] solution(int[] num_list, int n) {
		  int[] arr = Arrays.copyOfRange(num_list, 0, n);
		  return arr;
	  }
}
