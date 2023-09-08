package myProblem;
// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.

public class Problem1 {
    public static void main(String[] args) {
// 클래스를 만드는 이유 : 객체를 만들기 위한 틀
        Car aCar1 = new Car();
        Car aCar2 = new Car();


        // 출력 : 자동차가 최대속력 220km로 달립니다
        aCar1.spd(220);















        // 출력 : 자동차가 최대속력 250km로 달립니다.
        aCar2.spd(250 );
//
    }
}



class Car{

    int a; // int(자료형)에 a라는 변수를 주고
    public void spd(int a){// 이름(spd) (매개변수 int a) 만들고
       System.out.printf("자동차가 최대속력"+ a +"로 달립니다.\n", a);// 출력문을 만들어준다.
    }

}


