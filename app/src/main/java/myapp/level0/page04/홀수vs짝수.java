package myapp.level0.page04;

public class 홀수vs짝수 {
	public int solution(int[] num_list) {
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < num_list.length; i++) {
			if(i % 2 == 0) {
				even += num_list[i];
			} else {
				odd += num_list[i];
			}
		}
		return Math.max(even, odd);
	  }
}
