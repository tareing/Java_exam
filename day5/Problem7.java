package day5;
/*-
 D5 완료 : 메서드 오버라이드를 사용해서 처리
           - D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
        */
public class Problem7 {
    public static void main(String[] args) {

        Mallard mallard = new Mallard();

        mallard.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        White aWhite = new White();
        aWhite.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        Rubber rubber = new Rubber();
        rubber.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        Rubber2 aRubber2 = new Rubber2();
        aRubber2.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}
class 오리2 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class White extends 오리2 {

}

class Mallard extends 오리2 {

}

class Rubber extends 오리2 {
    void 날다() {
        System.out.println("날 수 없어요");
    }
}
class Rubber2 extends 오리2 {
    void 날다() {
        System.out.println("날 수 없어요");
    }
}

