package day5.Casting;

public class ObjectCasting {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

//        di.bark();
//        di.mewo();

        //객체는 자식 -> 부모 형병환 안전
        //부모 -> 자식은 위험. 수동형벼환
        //상속관계 없으면 형변환 x

    }
}
class Dog{

    public void bark(){
        System.out.println("멍멍");
    }
}
class Cat{
    public void meow(){
        System.out.println("양옹");
    }
}
