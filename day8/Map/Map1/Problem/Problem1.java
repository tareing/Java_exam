package day8.Map.Map1.Problem;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.print("첫번째 숫자를 입력해주세요 : "+ num);


       int num2 = scan.nextInt();
        System.out.print("두번째 숫자를 입력해주세요 : " + num2);

        System.out.printf("%d + %d = %\n",num +num2);

    }


}
