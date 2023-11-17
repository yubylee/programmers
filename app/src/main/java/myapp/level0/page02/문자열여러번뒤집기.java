package myapp.level0.page02;

public class 문자열여러번뒤집기 {
	 public String solution(String my_string, int[][] queries) {
		 String answer = "";
		 String[] str = my_string.split("");
		 for(int i = 0; i < queries.length; i++) {
			 int start = queries[i][0];
			 int end = queries[i][1];
			 for(int j = start; j <= (start+end)/2; j++) {
				String temp = str[j];
				str[j] = str[start + end - j];
				str[start + end -j] = temp;
			 }
		 }
		 for(String k : str) {
			 answer += k;
		 }
		 return answer;
	    }
}
