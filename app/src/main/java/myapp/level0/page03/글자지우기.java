package myapp.level0.page03;

public class 글자지우기 {
	public String solution(String my_string, int[] indices) {
		String answer = "";
		  String[] arr = my_string.split("");
		  for(int i = 0; i < indices.length; i++) {
			  arr[indices[i]] = "";
		  }
		  for(String k : arr) {
			  answer += k;
		  }
		  return answer;
	}
}
