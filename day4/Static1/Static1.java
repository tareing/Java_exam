package day4.Static1;

public class Static1 {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();

        p1.age = 40;
        p1.name = "이순신";

        p2.age = 30;
        p2.name = "홍길동";
        p2.avgAge = 100;

        p1.getLife();
        p2.getLife();

    }
}

class Person{

    // 인류 평균 나이는 모든 사람이 동일하게 공유해야 하는 값.
    // 객체들이 공유해야 하는 자원에는 static이 붙인다.
    static int avgAge;
    int age;
    String name;

    // non-static(static이 붙지 않은 것)을 사용할 수 없다.
    // 함수에는 일반적으로 static을 붙이지 않는다.
    // 단, main 함수는 예외.

    public  void getLife(){
        System.out.printf("의 남은 수명은 약 :%d 입니다",avgAge - age);
    }
}
