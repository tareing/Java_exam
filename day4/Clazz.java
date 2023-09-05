package day4;

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

        //아래코드 문제점 : 중복
        // System.out.printf("%d살 %s사는 %s입니다\n", arr.age, arr.home, arr.name);
        // System.out.printf("%d살 %s사는 %s입니다\n", arr2.age, arr2.home, arr2.name);
        //함수 -> 같은 클래스 내의 함수끼리는 서로 호출 가능
        // 클래스는 현실세계의 개념및 사물과 1:1 맵핑
        arr.introduce();
        arr2.introduce();

//        public static void introduce(){
////            System.out.printf("안녕하세요!!%d살 %s사는 %s입니다\n", age, home, name);
////        }
    }
}

// 클래스는 기본적으로 클래스 밖에 만든다.
// 컴퓨터한테 내가 생각한 어떤 개념 -> 컴퓨터한테 알려줘야 함.
// 클래스의 본질 -> 관련된 데이터의 묶음 + 해당 데이터를 사용하는 함수
// 인스턴스(복사본, 객체)를 사용하려면 static을 없애야함


// 객체 -> 개성을 표헌하기 위함
// 모든 객체가 공유하는 개념 -> 인류평균나이
class Person{
    int age;
   String name;
    String home;

   public  void introduce(){
       System.out.printf("안녕하세요!!%d살 %s사는 %s입니다\n", age, home, name);
   }
}

class Cat{
    int age;
    String kind;
    String name;
    String color;

    public void meow(){
        System.out.printf("%s고양이가 야옹 하고 웁니다.", color);
    }
}

class Computer{
    double cpu;
    int  ram;
    int ssd;

    public void poweron(){
        System.out.println("컴퓨터 전원이 켜집니다");
    }
    public void poweroff(){
        System.out.println("컴퓨터 전원이 꺼집니다");
    }
    public void boosting(){
        cpu++;
    }
}
