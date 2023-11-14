package myapp.level0.page01;

public class 조건문자열 {
	public int solution(String ineq, String eq, int n, int m) {
		if(ineq.equals(">") && eq.equals("=")) {
			return n >= m ? 1 : 0;
		} else if(ineq.equals("<") && eq.equals("=")){
			return n <= m ? 1 : 0;
		} else if (ineq.equals(">") && eq.equals("!")){
			return n > m ? 1 : 0;
		} else if (ineq.equals("<") && eq.equals("!")){
			return n < m ? 1 : 0;
		}
		return 0;
	}
}
