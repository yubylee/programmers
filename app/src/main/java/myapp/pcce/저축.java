package myapp.pcce;

import java.util.Scanner;

public class 저축 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();
        
        int money = start;
        int month = 1;
        
        while (money < 70) {
            money += before;
            month++;
        }
        while (money < 100) {
        	money += after;
            month++;
        }
        System.out.println(month);
	}
}
