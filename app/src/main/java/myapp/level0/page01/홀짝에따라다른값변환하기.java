package myapp.level0.page01;

public class 홀짝에따라다른값변환하기 {
	public int solution(int n) {
		int answer = 0;
		if(n % 2 != 0) {
			for(int i = 1; i <= n; i++) {
				if(i % 2 != 0) {
					answer += i;
				}
			}
		} else {
			for(int i = 1; i <= n; i++) {
				if(i % 2 == 0) {
					answer += (i*i);
				}
			}
		}
		return answer;
	}
}
