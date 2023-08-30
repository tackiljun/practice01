package org.example;

public class math05 {
    
    public static void main(String[] args) {
        
        int num = 285;

		// num < 0 이라면 (0미만) 출력 부분은 if문을 사용.
		if(num < 0) {
			System.out.println("0 미만");
		} else {

			switch (num / 100) {

			case 0 : // 0~99.
				System.out.println("0 이상 100 미만");
				break;
			case 1 : // 100~199.
				System.out.println("100 이상 200 미만");
				break;
			case 2 : // 200~299.
				System.out.println("200 이상 300 미만");
				break;
			default:
				System.out.println("300 이상");

			}

		}

    }

}
