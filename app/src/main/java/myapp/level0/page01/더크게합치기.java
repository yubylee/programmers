package myapp.level0.page01;

public class 더크게합치기 {
	public int solution(int a, int b) {
		String a1 = String.valueOf(a);
		String b1 = String.valueOf(b);
		
		int ab = Integer.parseInt(a1 + b1);
		int ba = Integer.parseInt(b1 + a1);
		
		if(ab > ba) {
			return ab;
		} return ba;
	}
}
