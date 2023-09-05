package day5.Inheritance;
/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
- D1 완료 : 클래스와 메서드를 만들어서 처리
- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
- D2 완료 : 클래스와 메서드를 만들어서 처리
- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
- D3 완료 : 상속을 사용해서 처리
- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
*/
public class Problem6 {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.Fly2();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.Fly2();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.Fly2();
        //출력 : 오리가 날개로 날아갑니다.
    }
}

class Fly{
    public void Fly2(){
        System.out.println("오리가 날개로 날아갑니다!!");
    }
}

class 고무오리 extends Fly{
    public void Fly2(){
        // 매서드 재정의 (오버라이딩)
        System.out.println("저는 날 수 없어요 ㅠㅠ");
    }
}

class 흰오리 extends Fly {

}

class 청둥오리 extends Fly {

}
