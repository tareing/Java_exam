package day6;

public class Constructor2 {
    public static void main(String[] args) {
        // 1. 편해짐
        // 2. 코드가 줄어듬
        // 3. 안할 수가 없음.
        Person p1 = new Person(20, "홍길동", new Car());
        p1.drive();
        p1.introduce();

        Person p2 = new Person(33, "이순신", new Car());
        p2.drive();
        p2.introduce();
    }
}
