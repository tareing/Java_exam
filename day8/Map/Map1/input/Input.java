package day8.Map.Map1.input;

import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        int a = 10;
//        System.out.println("hihi"); // 표준 출력

        //            int input = System.in.read();//표준 입렵
//            System.out.println();

        Scanner sc =new Scanner(System.in);
        // 입력이 필요한 경우
        int num = sc.nextInt();// 입력된 숫자를 하나 읽어옴.
        System.out.println("당신이 입력한 값은:" + num);

    }
}
