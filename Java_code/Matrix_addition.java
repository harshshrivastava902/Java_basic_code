import java.util.Scanner;

public class Matrix_addition {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // intialize 2d array

        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[2][3];

        // value for matrix 1
        // matrix1[0][0] = 101;
        // matrix1[0][1] = 102;
        // matrix1[0][2] = 103;
        // matrix1[1][0] = 111;
        // matrix1[1][1] = 112;
        // matrix1[1][2] = 113;

        //taking value from user matrix 1
        System.out.println("Enter the value for matrix 1 :");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrix1[i][j]=sc.nextInt();

            }
        }

        // value for matrix 2
        // matrix2[0][0] = 10;
        // matrix2[0][1] = 20;
        // matrix2[0][2] = 30;
        // matrix2[1][0] = 40;
        // matrix2[1][1] = 50;
        // matrix2[1][2] = 60;

        //taking value from user matrix 2
        System.out.println("Enter the value for matrix 2 :");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrix2[i][j]=sc.nextInt();

            }
        }

        //print the matrix 1
        System.out.println("Matrix 1");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j] + "\t");

            }
            System.out.println();
        }

        //print the matrix 2
        System.out.println("Matrix 2");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[i][j] + "\t");

            }
            System.out.println();
        }
        

        // array to store the value
        int[][] result = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }

        System.out.println("Result of addition of two matrix :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + "\t");

            }
            System.out.println();
        }

    }

}
