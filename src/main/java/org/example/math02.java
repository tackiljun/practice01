package org.example;

public class math02 {
    
    public static void main(String[] args) {
        
        int result = 1;

		for(int i = 1; i <= 10; i++) {
			result *= i;
		}
		System.out.println("1부터 10까지 숫자들의 곱한 값 : " + result);

    }
    
}
