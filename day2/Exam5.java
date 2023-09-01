package day2;

public class Exam5 {
    public static void main(String[] args) {
        // 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.
        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수


        for (int i = n; i <= m; i++) {// n단에서 m단까지에 반복문을 돌리는 코드
            if(i % 2 == 1 ){ // 반복문 돌린 n~m단에 홀수단을 판별하는 코드
                System.out.printf("===%d====");
                for (int j = 1; j <= limit ; j++) {// 곱셈을 for문으로 돌려서 limit까지 구하는 코드
                    if(j % 2 == 0){// 짝수곱만 출력하는 코드
                        System.out.println(i + " * " + j + " = " + i*j);
                    }
                }
            }

        }




    /*  입출력 예시
    n은 4, m은 20, limit는 10

    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    19 * 6 = 114
    19 * 8 = 152
    19 * 10 = 190


    */

    }
}
