import java.util.Scanner;

public class SpaceFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for finding space in that :");
        String str = sc.nextLine();
        int count_double_space = 0;
        int count_triple_space = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (str.charAt(i + 1) == ' ') {
                    // count_double_space++;
                    if (str.charAt(i + 2) == ' ') {
                        count_triple_space++;

                    } else {
                        count_double_space++;

                    }

                }
            }

        }
        System.out.println("The total num of double space is : " + count_double_space);
        System.out.println("The total num of Triple space is : " + count_triple_space);

    }
}
