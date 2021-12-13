import java.util.Scanner;

public class StringName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of user:"+" ");
        String name=sc.nextLine();
        System.out.println();
        System.out.print("Hello"+" "+name+","+"how are you?");


    }
}
