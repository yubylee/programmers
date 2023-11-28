package myapp.level0.page04;

import java.util.ArrayList;
import java.util.List;

public class n번째원소부터 {
	public int[] solution(int[] num_list, int n) {
		List<Integer> list = new ArrayList<>();
		for(int i = n-1; i < num_list.length; i++) {
			list.add(num_list[i]);
		}
		return list.stream().mapToInt(i->i).toArray();
	  }
}
