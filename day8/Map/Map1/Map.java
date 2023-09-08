package day8.Map.Map1;

import day5.Person;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.age = 22;
//        p1.name = "홀길동";
//        p1.height = 170.5;
        HashMap<String, Object> hong = new HashMap<>();
        hong.put("name","홍길동");
        hong.put("age", 25);
        hong.put("height", 162.4);

//        System.out.printf("이름 : %s\n"((String)hong.get("name")));
//        System.out.printf("이름 : %s\n"((int)hong.get("age")));
//        System.out.printf("이름 : %s\n"((double)hong.get("height")));


    }


//class Person{
    String name;
    int age;
    int height;


}
