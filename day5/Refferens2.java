package day5;

public class Refferens2 {
    public static void main(String[] args) {

        Person p1; // <<< 의미 :
        //p1은 null이다(값이 없음)
        p1 = new Person();// 사람을 한명 생성해서 리모컨을 p1 저장 (new를 생성하면 리모컨이 자동으로 생김(실체x))

        Person p2;
        p2 = new Person();// 사람을 한명 생성해서 사람 리모컨을 p2에 저장

        p1.age = 20;
        p1.name = "홍길동";

        p2.age = 30;
        p2.name = "이순신";

        p1.introduce();
        p2.introduce();

        p1 = p2;// p1이 p2를 가리킨다.

        p1.name = "임꺽정";

        System.out.println(p1.name); //출력 : 임꺽정
        System.out.println(p2.name); //출력 : 임꺽정

        //num1, num2는 원본이고, p1, p2는 참조(reference)다
        int num1 = 10;
        int num2 = num1;

        num2 = 20; // num2에 20을 넣는다고 num1이 20이 되지는 않는다.

    }
}
