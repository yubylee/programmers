package myapp.level0.page02;

import java.util.*;

public class 배열만들기4 {
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		int i = 0;
		
		while(i < arr.length) {
			if(list.size() == 0) {
				list.add(arr[i]);
				i++;
			} else {
				int last = list.get(list.size()-1);
				if(list.size() != 0 && last < arr[i]) {
					list.add(arr[i]);
					i++;
				} else {
					list.remove(list.size()-1);
				}
			}
		}
		
		return list.stream().mapToInt(x->x).toArray();
    }
}
