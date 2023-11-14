package myapp.level0.page02;

public class 주사위게임2 {
	public int solution(int a, int b, int c) {
		if(a == b && b == c) {
			return (a+b+c) * (a*a + b*b + c*c)* (a*a*a + b*b*b + c*c*c);
			
		} else if(a == b || b==c || a == c) {
			return (a+b+c) * (a*a + b*b + c*c);
			
		}else {
			return a + b + c;
		}
	  }
}
