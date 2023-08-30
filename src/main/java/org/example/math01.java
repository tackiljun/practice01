package org.example;

public class math01 {
    
    public static void main(String[] args) {
        
        int cnt = 1;

		while (cnt <= 100) {
			System.out.println(cnt++);
			// cnt++;
		}

		System.out.println("==========");

		do {
			// cnt--;
			System.out.println(--cnt);
		} while (cnt > 1);
    }
}
