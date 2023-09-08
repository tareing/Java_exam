package day8.Map.Map1.ExceptionExan;

public class Excep {
    public static void main(String[] args) {
        // 예외처리

        //컴파일 타임
        //문법 오류

        //런타임(프로그램 실해중) - > 런타임 에러
        //에러 -> 시스템, 네트워크, 머신
        //예외 -> 프로그래머의 실수

        System.out.println("hihi");

        try{ // 예외가 발생할 만한 지점을 try로 감싼다.
        // 갑자기 꺼지지 않게 우회 - > 예외처리
        int[] arr = new int[3];
        arr[10] = 10;  // 프로그래머의 실수
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 작업할 떄 문제 있는 거 같은데.. 확인해봐!");
        }

        System.out.println("bye");


        //
    }
}
