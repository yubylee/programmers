package myapp.level0.page03;

import java.util.ArrayList;
import java.util.List;

public class 접두사인지확인하기 {
  public int solution(String my_string, String is_prefix) {

    List<String> list = new ArrayList<>();

    for(int i = 0; i < my_string.length(); i++) {
      list.add(my_string.substring(0, i));
    }

    for(int j = 0; j < list.size(); j++) {
      if(list.get(j).equals(is_prefix)) {
        return 1;
      }
    }
    return 0;
  }
}