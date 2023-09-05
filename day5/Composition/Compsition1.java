package day5.Composition;

public class Compsition1 {
    public static void main(String[] args) {

        홍길동 a홍길동 = new 홍길동();
        a홍길동.자바_프로그래밍();
        a홍길동.C언어_프로그래밍();
        a홍길동.파이썬_프로그래밍();
        a홍길동.a홍길순.파이썬_프로그래밍(); // 홍길동이 가지고 있는 a홍길순 변수로 홍길순이 가지고 있는 파이썬_프로그래밍에 접근

        이순신주식회사 a이순신주식회사 = new 이순신주식회사();
        a이순신주식회사.파이썬_프로그래밍();

    }
}

class 이순신주식회사{

    홍길순 a홍길순 = new 홍길순();

    public void 파이썬_프로그래밍(){
        a홍길순.파이썬_프로그래밍();
    }
}
// 홍길도 -> C언어, 자바
// 조합, 구성 -> 객체들의 조합을 통해 클래스를 만드는 방식
class 홍길동{

    홍길순 a홍길순 = new 홍길순();

    public void C언어_프로그래밍(){
        System.out.println("C언어 프로그램 개발");
    }
    public void 자바_프로그래밍(){
        System.out.println("자바8 프로그램 개발");
    }
    public void 파이썬_프로그래밍(){
        a홍길순.파이썬_프로그래밍();
    }
}
// 홍길순 -> 자바,파이썬
class 홍길순{
    public void 자바_프로그래밍(){
        System.out.println("자바8 프로그램 개발");
    }
    public void 파이썬_프로그래밍(){
        System.out.println("파이썬3.13 프로그램 개발");
    }

}
