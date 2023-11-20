package myapp.level0.page03;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기5 {
  public int[] solution(String[] intStrs, int k, int s, int l) {
    List<Integer> list = new ArrayList<>();

    for(int i = 0; i < intStrs.length; i++) {
      int number = Integer.parseInt(intStrs[i].substring(s, s+l));
      if(number > k) {
        list.add(number);
      }
    }

    return list.stream().mapToInt(i->i).toArray();
  }
}
