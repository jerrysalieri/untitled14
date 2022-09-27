import java.util.Scanner;
public class Test {
    public static String inputData(){
        System.out.println("Input:");
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();

        return data;
    }
    public static void myMethod(){
        System.out.print("I just used a method without return value");
    }
    public static int Number(){

        int test;
        test =Integer.parseInt(inputData());
        return test;
    }
    public static void main(String []args){
        System.out.println(Number());
       myMethod();
    }
}
