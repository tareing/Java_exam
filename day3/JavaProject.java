package day3;

public class JavaProject {
//    public static  void dd(int radius){
//        System.out.println( radius * radius * 3.14);
//    }
//
//    public static  void vv(int radius){
//        System.out.println( radius * radius * 3.14 / 2);
//    }
//
//    public static  void bb(int radius){
//        System.out.println( radius * radius * 3.14 * 2);
//    }

    public  static  double circleArea(int radius){
        double result = radius * radius * 3.14;
        System.out.println(result);

        return result;
    }


    public static void main(String[] args) {


        //1. 반지름으로 원의 넓이를 구하는 함수 만들기.
        //-  반지름 * 반지름 * 3.14

        //2. 반지름이 5인 원의 넓이를 구해서 출력
        double num =  circleArea(5);



        //3. 반지름이 5인 원의 넓이를 2로 나눈 값.


        //4. 반기름이 5인 원의 넓이를 2 곱한 값

        //리턴 -> 함수가 작업한 결과를 직접 받을 수 있음.
        //함수의 결과를 2차 가공할  수 있음.

    }
}
