package day5;

public class Refferens {

    public static  void test(String param){
        System.out.println(param);
    }
    public static void main(String[] args) {
       int num = 10;
       String str = "Hello";
       double du = 3.14;



       test(str);

        System.out.println(num);
    }
}
