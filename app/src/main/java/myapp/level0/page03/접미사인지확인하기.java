package myapp.level0.page03;

import java.util.ArrayList;
import java.util.List;

public class 접미사인지확인하기 {
  public int solution(String my_string, String is_suffix) {
    List<String> list = new ArrayList<>();
    for(int i = 1; i <= my_string.length(); i++) {
      list.add(my_string.substring(my_string.length()-i, my_string.length()));
    }

    for(int j = 0; j < list.size(); j++) {
      if(list.get(j).equals(is_suffix)) {
        return 1;

      }
    }
    return 0;
  }
}
