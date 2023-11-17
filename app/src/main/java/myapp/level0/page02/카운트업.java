package myapp.level0.page02;

import java.util.*;

public class 카운트업 {
public int[] solution(int start_num, int end_num) {
        List<Integer> list = new ArrayList<>();
        for(int i = start_num; i <= end_num; i++) {
        	list.add(i);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}
