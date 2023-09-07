package day6.exam1;

public class ContructorOverloading {
    public static void main(String[] args) {
        Person p1 = new Person(20,"홍길동");
        p1.introduce();

        Person p2 = new Person();

        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person(30);

        p3.name = "홍길순";
    }
}
class Person{
    int age;
    String name;
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    Person(){

    }

    Person(int age){
        this.age = age;
    }
    void introduce(){
        System.out.printf("%d살 %s입니다",this.age, this.name);
    }
}
// 디폴트 생성자는 자바 자동으로 만을어준다.
// 단, 여러분이 생성자를 하나라도 만들면 디폴트 생성자는 자동으로 생기지 않았는다.
