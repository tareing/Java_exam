package day2;

public class Condition {
    public static void main(String[] args) {
        //조건문

        //실행이 될 수도 있고 안될 수도 있는

        System.out.println("창문 닫기");

        //비가 올 때만 창문을 닫기 ->
        boolean isRain = true;
        if (isRain) {
            System.out.println("창문 닫기2");
        }

        //야식
        //소지금이 20000만원 이상일 떄
        int monney = 25000;

        if (monney >= 20000) {
            System.out.println("치킨");
        }
        //소지금이 20000만원 미만일 떄, 2000이상일 때
        // if는 조건 하나당 if 하나
        if (monney < 20000) {
            if (monney >= 2000) {
                System.out.println("포카칩");
            }
        }
        if (monney < 20000 && monney >= 2000) {
            System.out.println("포카칩");
        }

        //할인대상 -> 19세 이하, 60세 이상가 할인 대상
        int age = 11;
        if (age <= 19) {
            System.out.println("할인대상");
        }
        if (age >= 60) {
            System.out.println("할인대상");
        }
        if (age <= 19 || age >= 60) {
            System.out.println("할인대상");
        }

        //논리 연산

        //곱연산(and)-&&
        //모두 참이면 참,그외 거짓
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || true);

        //합연산(or)-||
        //모두 거짓이면 거짓, 그외 참
        System.out.println(false);

        // 조건문 -> 택일구조

        //양자택일(이지선다)
        //남겨, 할인대상, 홀짝..등등
        boolean isMale = true;

        if (isMale) {
            System.out.println("남자");
        }



        //삼자택일(삼지선다)
        //초중고, 직,좌,우..등등
        int age2 =18;
        if(age2 >= 8 && age2 <=13){
            System.out.println("초등학교");
        }
        else
        if(age2 >= 16){
            System.out.println("중학교");
        }
        else
        if(age2 <= 19){
            System.out.println("고등학교");
        }
        //System.out.println("초등학교");//8-13
       // System.out.println("중학교");//13-16
        //System.out.println("고등학교");//17-19

        //오자택일(사지선다)
        //대학성적(A,B,C,D,F)
        //점수가 90 ~ 100 A
        //89
        // ~ 70 B
        //70~80 C
        //60~70 D
        //60 미만 -> F
        int score = 59;
        if(score >= 17 && score <= 20){
            System.out.println("F");
        }
        else
        if(score >= 70){
            System.out.println("D");
        }
        else
        if(score >= 80){
            System.out.println("C");
        }
        else
        if(score >= 85){
            System.out.println("B");
        }
        else
        if(score >= 90){
            System.out.println("A");
        }



















    }

}
