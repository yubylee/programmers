package myapp.level0.page04;

import java.util.ArrayList;
import java.util.List;

public class 숫자5명씩 {
	public String[] solution(String[] names) {
		List<String> list = new ArrayList<>();
		for(int i = 0; i < names.length; i += 5) {
			list.add(names[i]);
		}
		return list.stream().toArray(String[]::new);
	  }
}
