package myapp.level0.page02;

public class 코드처리하기 {
	 public String solution(String code) {
		 String result = "";
		 int mode = 0;
		 for(int i = 0; i < code.length(); i++) {
			 if(code.charAt(i) == '1') mode = 1 - mode;
			 else if(i % mode == 0) result += code.charAt(i);
		 }
		 return "".equals(result) ? "EMPTY" : result;
	  }
}
