package day2;

public class Operator {
    public static void main(String[] args) {

        //산술연산자
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);

        //나누기 할 때 -> 정수/정수 = 정수
        // 컴퓨터는 정수끼리, 실수끼리 계산 가능(1, 1.0은 완전 다른 수)
        // 정수 - int
        // 실수 - doble
        System.out.println(10 / 20);
        System.out.println(1.0 / 2.0);

        int i =10;
        double d = 10.0;
        String s = "홍길동";

        //나머지 구하기 = 배수, 짝수 구할 때 사용, 주기 표현
        System.out.println(2 % 1);


        //비교연산자
        System.out.println(10 > 5);
        System.out.println(10 < 5);
        System.out.println(10 >= 5);
        System.out.println(10 <= 5);
        System.out.println(10 == 5);
        System.out.println(10 != 5);

        //비교연산자의 결과는 논리값(맞다/틀리다)
        //논리값 -> boolean

        System.out.println(10);
        System.out.println("10");

        System.out.println("true");
        System.out.println(true);

        boolean b = true;
        boolean o = false;

    }
}
