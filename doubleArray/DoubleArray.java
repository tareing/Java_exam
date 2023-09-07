package doubleArray;

public class DoubleArray {


    public static void main(String[] args) {
        int[][] darr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16},
        };
        int[][] darr2 = new int[4][4];

//        for (int i = 0; i < darr.length; i++) {
//            for (int j = darr[i].length - 1, k = 0; j >= 0; j--, k++) {
//                darr2[i][k] = darr[i][j];
//                System.out.println(darr2[i][k] + " ");
//            }
//        }

        System.out.println("========================================");
        int[][] darr3 = new int[4][4];
        for (int i = 3; i < darr.length; i--) {
            for (int j = darr[i].length  - 1, k = 0; j >= 0; i--, k++ ) {
                darr3[i][k] = darr[i][j];
                System.out.println(darr3[i][k] + " ");
            }
        }
    }

    // i = 3(세로)  j = 3(가로)  k= 3 j가 0보다가 크거나 같을 떄 까지
}



// 1. 다음과 같이 출력되게 해주세요.
    /*

    4 3 2 1
    8 7 6 5
    12 11 10 9
    16 15 14 13

    */

// 2. 다음과 같이 출력되게 해주세요.
    /*

    16 12 8 4
    15 11 7 3
    14 10 6 2
    13  9 5 1

    */