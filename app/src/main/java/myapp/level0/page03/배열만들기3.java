package myapp.level0.page03;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기3 {
	public int[] solution(int[] arr, int[][] intervals) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < intervals.length; i++) {
			for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {
				list.add(arr[j]);
			}
		}
		return list.stream().mapToInt(i->i).toArray();
	  }
}
