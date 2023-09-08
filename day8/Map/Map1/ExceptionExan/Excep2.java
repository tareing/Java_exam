package day8.Map.Map1.ExceptionExan;
public class Excep2 {
    public static void main(String[] args) {
        Person p1 = null;
        try {
            p1.a();
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
class Person{
    public void a(){
        System.out.println("dd");
    }
}
