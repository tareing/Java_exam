package day8.Map.Map1.Problem2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // 입력 받을 떄 nextLine으로 통일
        Scanner sc = new Scanner(System.in);



        // 문자를 -> 숫자로 변환
        // 관련 없는 타입끼리는 형변환x


        //Integer 래퍼클래스 사용
        System.out.print("나이를 입력해주세요 : ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();


        System.out.printf("안녕하세요 %d세 %s입니다\n", age, name);
    }

  
}
