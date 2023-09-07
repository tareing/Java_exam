package day6;

public class Constructor {
    public static void main(String[] args) {
//        Person p1 = new Person();

        // 올바른 데이터 세팅 <--------- 반.드.시 필요
        // 객체 초기화(initialize)
//        p1.age = 20;
//        p1.name = "홍길동";
//        p1.myCar = new Car();]
//        Car car1 = new Car();
//        p1.init(20, "홍길동", car1);
//        p1.drive();

        // 초기화 조금 더 편하게 개선. -> 메서드로 제작

        // 객체의 함수는 데이터를 이용해서 기능을 수행.
        // 데이터가 있어야 함수가 올바르게 작동한다.


//        p1.introduce();
//        p1.drive();

//        Person p2 = new Person();
//        p2.init(30, "이순신", new Car());
//        p2.introduce();
//        p2.drive();
        // 객체를 만들면 묻따않고 그냥 실행해버리는 메서드?? -> 생성자

//        Person p3 = new Person();// Person() => 메서드(생성자)

    }
}
class Person{

    int age; // 0


    String name; // null

    Car myCar; // null

    // 생성자
    // 리턴타입 X, 메서드명은 클래스명과 동일

    public Person(int age, String name, Car myCar){
        System.out.println("사람 한명 생성");
        this.age = age; // 함수는 자기 거를 우선으로 쓰기 때문에 인스턴스 변수를 가리키기  위해 this를 쓴다.
        this.name = name;
        this.myCar = myCar;
    }



    public void introduce(){
        System.out.printf("안녕하세요 저는 $d살 %s입니다.\n", age, name);
    }
    public  void drive(){
        myCar.use();
    }
}
class Car{
    public void use(){
        System.out.println("차를 탄다");
    }
}
