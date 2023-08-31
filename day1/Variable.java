package day1;

public class Variable {
    public static void main(String[] args) {

        // 홍길동의 나이를 저장했다가 필요할 때 사용

        // 값을 저장하는 상자(그릇) - 변수
        // 변수를 만들 때는 크기와 모양 결정
        // 값 -> 숫자(int), 문자(String)
        // 변수를 만들 때는 변수의 이름이 필요

        // 자료형(타입) 변수명
        //= 기준 오른쪽 값을 왼쪽 변수에 저장

        // int age; // 그릇을 만들고
        // age = 25; // 그릇에 저장

        // 변수 사용시 주의할 점.
        // 1. 같은 이름으로 두개 이상 변수 만들지 않기
        // 2. 숫자나 특수문자로 시작하는 이름은 안됌. 공백도 안됌.

        // 변수 사용

        int age = 25; // 그릇을 만듦과 동시에 저장

        // 홍길동의 나이를 한번만 사용해서 자기소개 5번출력
        String s = "안녕하세요 25살 홍길동입니다";

        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);

        System.out.println("안녕하세요" + age +"살 홍길동입니다");
        System.out.println("안녕하세요" + age +"살 홍길동입니다");
        System.out.println("안녕하세요" + age +"살 홍길동입니다");
        System.out.println("안녕하세요" + age +"살 홍길동입니다");
        System.out.println("안녕하세요" + age +"살 홍길동입니다");

        // 변수 사용방법2
        // 변수 재활용 가능(단, 하나의 값만 저장 가능)
        int num = 10; // int를 저장하는 num이라는 이름의 변수 생성하고 10 저장
        System.out.println(num);

        num = 30; // num이라는 이름의 변수를 가져와서 기존의 10 버리고, 20을 저장
        System.out.println(num);

        // 변수의 값을 다른 변수에 대입 가능
        int num2 = 50;
        System.out.println(num2);

        num2 = num;

        System.out.println(num);




    }
}



