package day4;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Clazz {
    public static void main(String[] args) {
        //1. 클래스가 함수를 모아놓느 느낌
        //2. 변수를 모아놓는 느낌

        //변수
        //사람 표현 -> 이름, 나이, 거주지

        String name = "홍길동";
        String home = "대전";
        int age = 20;

        System.out.printf("%d살 %s사는 %s입니다\n", age, home, name);

        String name2 = "이순신";
        String home2 = "서울";
        int age2 = 40;

        System.out.printf("%d살 %s사는 %s입니다\n", age2, home2, name2);

        int[] person1 = {175, 60, 22};
        int[] person2 = {185, 70, 32};

        System.out.printf("키 : %d, 몸무게 : %d, 나이: %d\n", person1[0], person1[1], person1[2]);
        // 배열을 사용하면 -> 같은 자료형은 표현가능. 0번쨰, 1번쨰 가각 무엇을 가리키는지 알기가 어렵다.

        // 객체 -> 관련된 데이터를 묶는다.

        //int - 4
        //String - 8
      //  int[] arr = {20, "대전", "홍길동"};
//        {170, 67, "이순신"};
//        {170, "이순신", 67};


//      키, 몸무게
        Person arr = new Person();

        arr.age = 20;
        arr.home = "대전";
        arr.name = "홍길동";

        Person arr2 = new Person();

        arr2.age = 30;
        arr2.home = "금산";
        arr2.name = "홍길똥";

        System.out.printf("%d살 %s사는 %s입니다\n", arr.age, arr.home, arr.name);
        System.out.printf("%d살 %s사는 %s입니다\n", arr2.age, arr2.home, arr2.name);

    }
}

// 클래스는 기본적으로 클래스 밖에 만든다.
// 컴퓨터한테 내가 생가한 어떤 개념 -> 컴퓨터한테 알려줘야 함.
// 클래스의 본질 -> 관련된 데이터의 묶음
class Person{
    int age;
    String name;
    String home;
}