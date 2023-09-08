package day8.Map.Map1.input;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        String str = sc2.next();

        System.out.println("당신이 입력한 단어는:" + str);

        sc2.nextInt();
        // 공백을 포함한 한 문장을 가져오는 방법
       String str2 =  sc2.nextLine();

        System.out.println("당신이 입력한 단어는:" + str2);
    }
}
