package myapp.level0.page05;

public class 길이에따른연산 {
  public int solution(int[] num_list) {
    int sumResult = 0;
    int multiplyResult = 1;
    if(num_list.length >= 11) {
      for(int k : num_list) {
        sumResult += k;
      }
    } else {
      for(int k : num_list) {
        multiplyResult *= k;
      }
    }
    return num_list.length >= 11 ? sumResult : multiplyResult;
  }
}
