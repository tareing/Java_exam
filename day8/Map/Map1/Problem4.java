package day8.Map.Map1;
import java.util.Scanner;


public class Problem4 {
    public static void main(String[] args) {
        // 올바른 나이를 입력할 때까지 계속 물어보기.
        // 나이는 0보다 커야 하며, 문자값이 들어가면 안된다.
        // 0이하의 값이 들어가면 0보다 커야합니다 출력하고 다시 입력요구
        // 숫자가 아닌 문자가 들어가면 숫자를 입력해주세요 출력하고 다시 입력요구
        // 올바른 숫자가 입력되면 입력된 숫자를 출력해주고 종료.

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("나이를 입력해주세요 : ");
            try { //코드가 불안해서 코드에러가 났을 때 우회하기 위해 try로 감쌈.
                int age = Integer.parseInt(scan.nextLine());// 문자 -> 숫자로변환
                //scn.nextLine() <- 공백이 있는 문자열 한줄을 리턴 해줌.
                if (age <= 0) {
                    System.out.println("1 이상의 정수를 입력해주세요.");
                } else {
                    System.out.println("종료합니다. 나이는=" + age);
                    break;// if문 종료
                }
            } catch (Exception x) { //프로그래머 실수가 나왔을 떄 "숫자를 입력해주세요" 실행
                System.out.println("숫자를 입력해주세요");
            }
        }
    }
}

