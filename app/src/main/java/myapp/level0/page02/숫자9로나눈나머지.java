package myapp.level0.page02;

public class 숫자9로나눈나머지 {
	public int solution(String number) {
		String[] str = number.split("");
		int sum = 0;
		for(int i = 0; i < str.length; i++) {
			sum += Integer.parseInt(str[i]);
		}
		return sum % 9;
    }
}
