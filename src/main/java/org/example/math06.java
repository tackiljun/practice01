package org.example;

public class math06 {
    
    public static void main(String[] args) {
        
        int num = 1;
		int sum = 0; // 합을 저장하는 변수.

		while (num < 100) {
			// 반복 처리하는 문장 : 합을 구하는 연산.

			sum += num;
			num++;
		}

		sum = 0;

		for (int i = 1; i < 100; i++) {
			sum += i;
		}
		System.out.println("1부터 99까지의 합 : " + sum);

    }
    
}
