package myapp.level0.page03;

public class 문자개수세기 {
	public int[] solution(String my_string) {
		char[] c = my_string.toCharArray();
		int[] arr = new int[52];
		for(int i = 0; i < my_string.length(); i++) {
			if(c[i] <= 90) {
				arr[c[i]-'A']++;
			} else {
				arr[c[i] - 71]++;
			}
		}
		return arr;
    }
}
