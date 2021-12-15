import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the given number : ");
        int given_num = sc.nextInt();
        System.out.println();
        System.out.print("Enter the number to be checked for greatest :");
        int user_num = sc.nextInt();
        if(user_num>given_num)
        {
            System.out.println("\n"+user_num+" is greater than "+given_num);
        }
        else{
            System.out.println(user_num+" is not greater than "+given_num);
        }
    }
}