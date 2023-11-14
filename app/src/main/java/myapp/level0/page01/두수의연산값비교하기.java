package myapp.level0.page01;

public class 두수의연산값비교하기 {
public int solution(int a, int b) {
		String stra = String.valueOf(a);
		String strb = String.valueOf(b);
		
		int ab = Integer.parseInt(stra + strb);
		int ba = 2 * a * b;
		if(ab >= ba) return ab;
		return ba;
	}
}
