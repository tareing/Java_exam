package SoloArray;

public class Array {
    public static void main(String[] args) {
        //배열(Array)

        //배열은 하나의 변수로 여러개의 값을 관리
        //1. 선언과 동시에 저장
        int[] arr = {1,2,3,4,5};

        //순서(순번) - index
        System.out.println();
        System.out.println();

        //2. 선언하고 나중에 저장
        // new 자료형[개수]
        int[] arr2 = new int[100]; // 0 100개 만들어짐
        int[] arr3 = new int[5]; // 0 5개 만들어짐

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        System.out.println(arr3[4]);
        //regewrtgwr
        // arr3 배열에 5개의 숫자 저장

        arr3[4] = 40;
        arr3[2] = 20;
        arr3[0] = 10;
        arr3[1] = 10;
        arr3[3] = 30;

        // 0~4 출력
//        System.out.println(arr3[0]);
//        System.out.println(arr3[1]);
//        System.out.println(arr3[2]);
//        System.out.println(arr3[3]);
//        System.out.println(arr3[4]);

        // 반복문 사용 가능 -> 일괄 처리(순회)
        for(int i = 0; i < 5; i++){
            System.out.println(arr3[i]);
        }

        // 배열은 같은 자료형만 저장 가능합니다.
        String[] arr5 = new String[3]; //null 3개가 채워짐. null은 값이 비어있다는 표현
        // "null" -> 문자열 null -> 값없음
        arr5[0] = "hello";
        arr5[1] = "byebye";
        arr5[2] = "hihi";




    }
}
