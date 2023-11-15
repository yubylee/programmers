package myapp.level0.page02;

public class 연금 {
	public static void main(String[] args) {

		int normal = 2000000;
		int fastOne = 1880000 * 12;
		int cnt = 0;
		while (true) {
			normal += 2000000;
			fastOne += 1880000;
			if(fastOne <= normal) {
				break;
			}
			cnt++;
		}
		System.out.println(normal);
		System.out.println(fastOne);
		System.out.println(cnt);
		System.out.println(171/12);
	}
}
