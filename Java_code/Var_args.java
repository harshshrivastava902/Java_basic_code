public class Var_args {

    // method taking mulitple argumnet
    static int sum(int... arr) {
        // available as int [] array
        int result=0;
        for (int i : arr) {
            result+=i;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("sum of 2 and 4 is :"+sum(2,4));
        System.out.println("sum of 2,4,5,6 is :"+sum(2,4,5,6));

        //if pass no argument then it return 0
        System.out.println("Sum of nothing :"+sum());

    }
}
