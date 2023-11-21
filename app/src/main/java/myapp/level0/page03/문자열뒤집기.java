package myapp.level0.page03;

public class 문자열뒤집기 {
  public String solution(String my_string, int s, int e) {
    char[] c = my_string.toCharArray();
    while(s < e) {
      char temp = c[s];
      c[s] = c[e];
      c[e] = temp;
      s++;
      e--;
    }
    return new String(c);
  }
}
