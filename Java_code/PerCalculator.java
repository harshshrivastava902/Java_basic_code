import java.util.Scanner;

public class PerCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the marks scored out of 100==>");
        System.out.print("Marks in phy:"+" ");
        float phy=sc.nextFloat();
        System.out.println();
        System.out.print("Marks in chem:"+" ");
        float chem=sc.nextFloat();
        System.out.println();
        System.out.print("Marks in maths:"+" ");
        float maths=sc.nextFloat();
        System.out.println();
        System.out.print("Marks in eng:"+" ");
        float eng=sc.nextFloat();
        System.out.println();
        System.out.print("Marks in ip:"+" ");
        float ip=sc.nextFloat();

        float percentage=((phy+chem+maths+eng+ip)/500)*100;
        System.out.print("Calculated Percentage:"+" "+percentage);
        


        

    }
}
