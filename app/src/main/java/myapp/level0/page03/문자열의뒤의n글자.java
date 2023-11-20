package myapp.level0.page03;

public class 문자열의뒤의n글자 {
  public String solution(String my_string, int n) {
    return my_string.substring(my_string.length()-n, my_string.length());
  }
}
