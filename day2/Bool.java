package day2;

public class Bool {
    public static void main(String[] args) {
        if (true) {
            System.out.println();
        }

        if (false) {
            System.out.println();
        }

        int a = 10;
        // `==` => 같다.
        if (a == 10) {
            System.out.println(true);
        }

        // `!=` => 같지 않다.
        if (a != 10) {
            System.out.println(false);
        }

        if (a > 10) {
            System.out.println(false);
        }

        if (a >= 10) {
            System.out.println(true);
        }

        int b = 10;

        if (a == b) {
            System.out.println(true);
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if (c) {
            System.out.println(false);
        }

        if (c == false) {
            System.out.println(false);
        }

        // `!` => 반전
        if (!c) {
            System.out.println(true);
        }

        // `!` => 반전
        if (!(!c)) {
            System.out.println(false);
        }

        boolean d = true;

        if (c != d) {
            System.out.println(true);

            //증강연산자

            int num = 10;
            System.out.println(num + 10);
            System.out.println(num);

            //num의 값을 10 증가
            num = num + 10;

            System.out.println(num);
            num = num - 5;
            System.out.println(num);

            num *= 2;
            System.out.println(num);

            num /= 2;
            System.out.println(num);

            //1증가
            num++;
            System.out.println(num);

            //1감소
            num--;
            System.out.println(num);
        }
    }
}
