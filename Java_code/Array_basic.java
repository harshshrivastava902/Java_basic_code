public class Array_basic {
    public static void main(String[] args) {
        // int [] my_array=new int[5];
        int[] arr = { 98, 45, 25, 65, 24 };
        // for each loop
        for (int element : arr) {
            System.out.print(element + "\t");
        }
        System.out.println();
        // 2-d array
        int[][] flats = new int[2][3];

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 111;
        flats[1][1] = 112;
        flats[1][2] = 113;

        // printing 2d array

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(flats[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
