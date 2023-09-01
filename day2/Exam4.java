package day2;

public class Exam4 {
    public static void main(String[] args) {
        // 문제 : 구구단 작성
// 조건 : 짝수번째만 곱하기
/* 출력예시 :

  2 * 2 = 4
  2 * 4 = 8
  2 * 6 = 12
  2 * 8 = 16


 */
        for(int i = 2; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.println(i*j);
            }
        }



    }
}
