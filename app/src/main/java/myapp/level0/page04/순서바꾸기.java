package myapp.level0.page04;


import java.util.LinkedList;
import java.util.List;

public class 순서바꾸기 {
	public int[] solution(int[] num_list, int n) {
		List<Integer> list = new LinkedList<>();
		for(int i = n; i < num_list.length; i++) list.add(num_list[i]);
		for(int j = 0; j < n; j++) list.add(num_list[j]);
		return list.stream().mapToInt(i->i).toArray();
	  }
}
