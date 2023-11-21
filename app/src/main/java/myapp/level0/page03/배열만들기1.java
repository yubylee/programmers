package myapp.level0.page03;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기1 {
	public int[] solution(int n, int k) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			if(i % k == 0) {
				list.add(i);
			}
		}
		return list.stream().mapToInt(i->i).toArray();
    }
}
