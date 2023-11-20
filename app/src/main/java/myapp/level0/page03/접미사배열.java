package myapp.level0.page03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 접미사배열 {
  public String[] solution(String my_string) {
    List<String> list = new ArrayList<>();
    for(int i = 1; i <= my_string.length(); i++) {
      list.add(my_string.substring(my_string.length()-i, my_string.length()));
    }
    Collections.sort(list);
    return list.stream().toArray(String[]::new);
  }
}
