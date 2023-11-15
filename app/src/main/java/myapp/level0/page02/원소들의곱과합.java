package myapp.level0.page02;

public class 원소들의곱과합 {
	public int solution(int[] num_list) {
		int sum = 0;
		int multi = 1;
		for(int k : num_list) {
			sum += k;
			multi *= k;
		}
		if(multi < (sum*sum)) {
			return 1;
		}return 0;
	   }
}
