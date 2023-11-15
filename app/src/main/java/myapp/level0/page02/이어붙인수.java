package myapp.level0.page02;

public class 이어붙인수 {
	public int solution(int[] num_list) {
		String str1 = "";
		String str2 = "";
		for(int k : num_list) {
			if(k % 2 == 0) {				
				 str1 += String.valueOf(k);
			} else {
				str2 += String.valueOf(k);
			}
		}
		return Integer.parseInt(str1) + Integer.parseInt(str2);
    }
}
