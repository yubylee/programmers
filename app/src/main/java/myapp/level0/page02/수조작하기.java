package myapp.level0.page02;

public class 수조작하기 {
	public int solution(int n, String control) {
		String[] str = control.split("");
		for(String k : str) {
			if(k.equals("w")) {
				n += 1;
			} else if(k.equals("s")) {
				n -= 1;
			} else if(k.equals("d")) {
				n += 10;
			} else if(k.equals("a")) {
				n -= 10;
			}
				
		}
		return n;
    }
}
