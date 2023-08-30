package org.example;

public class math04 {
    
    public static void main(String[] args) {
        
        // 숫자출력하기?????.
        int num = 285;

		if (num < 0) {
            // num < 0 이라면 (0미만) 출력.
			System.out.println("0 미만 입니다.");
		} else if (num < 100) {
            // 0 ≤ num <100 이라면 (0이상 100미만) 출력.
			System.out.println("0 이상 100 미만 입니다.");
		} else if (num < 200) { 
            // 100 ≤ num < 200 이라면 (100이상 200미만) 출력.
			System.out.println("100 이상 200 미만 입니다.");
		} else if (num < 300) {
            // 200 ≤ num < 300 이라면 (200이상 300미만) 출력.
			System.out.println("200 이상 300 미만 입니다.");
		} else {
            // 300 ≤ num 이라면 (300이상) 출력.
			System.out.println("300 이상입니다.");
		}

    }

}
