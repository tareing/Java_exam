package day6.Problem.a;
// 출력 : 아래와 같이 출력되게 해주세요.
public class Problem2 {
    public static void main(String[] args) {
        사람 a사람 = new 사람(10);
        a사람.a왼팔 = new 팔();
        System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}
class 사람{
    int 나이;

    팔 a왼팔;
    public 사람(int 나이){
        this.나이 = 나이;

    }
}
class 팔{
    int 길이 = 100;

    팔(){
        this.길이 = 100;
    }
}