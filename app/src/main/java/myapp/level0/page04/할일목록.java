package myapp.level0.page04;

import java.util.ArrayList;
import java.util.List;

public class 할일목록 {
	public String[] solution(String[] todo_list, boolean[] finished) {
		List<String> list = new ArrayList<>();
		for(int i = 0; i < todo_list.length; i++) {
			if(finished[i] == false) {
				list.add(todo_list[i]);
			}
		}
		return list.stream().toArray(String[]::new);
	  }
}
