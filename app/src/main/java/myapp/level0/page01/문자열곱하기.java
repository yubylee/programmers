package myapp.level0.page01;

public class 문자열곱하기 {
	public String solution(String my_string, int k) {
		String result = "";
		for(int i = 0; i < k; i++) {
			result += my_string;
		}
		return result;	
		}
}
