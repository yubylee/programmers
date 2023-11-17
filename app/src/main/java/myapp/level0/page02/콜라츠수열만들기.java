package myapp.level0.page02;

import java.util.*;

public class 콜라츠수열만들기 {
	public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n!=1) {
        	if(n % 2 == 0) {
        		n /= 2;
        	} else {
        		n = 3 * n + 1;
        	} 
        	list.add(n);        	
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
