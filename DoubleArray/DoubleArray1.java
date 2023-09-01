package DoubleArray;

public class DoubleArray1 {
    public static void main(String[] args) {
        //1차원 배열
        int a = 1;
        int b = 2;
        int c = 3;

        int[] arr = {a,b,c};

        int d = arr[0];

        //2차원 배열 -> 배열의 배열

        int[] arr1= {1,2,3,4};
        int[] arr2= {5,6,7,8};
        int[] arr3= {9,10,11,12};

        int[][] darr = {arr1,arr2,arr3};

        int[] arr4 = darr[0];
        System.out.println(darr[0][0]); //
        System.out.println(darr[1][1]);
        System.out.println(darr[2][3]);

        //이차원배열[세로][가로]
        //이차원배열[행][열]

        //2차원 배열 선언

        int[][] darr2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}

        };
        System.out.println(darr2[1][2]);

        System.out.println("=======2차원 배열 순회========");
        //2차원 배열 순회 -> 전체 다 한번씩 접근
       for(int j = 0; j < 3; j++){
           for (int i = 0; i < 4; i++){
           System.out.println(darr2[j][i]);
           }
       }



    }
}
