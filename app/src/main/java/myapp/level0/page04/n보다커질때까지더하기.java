package myapp.level0.page04;

public class n보다커질때까지더하기 {
	public int solution(int[] numbers, int n) {
		int sum = 0;
		int i = 0;
		while(sum <= n) {
			sum += numbers[i];
			i++;
		}
		return sum;
	  }
}
