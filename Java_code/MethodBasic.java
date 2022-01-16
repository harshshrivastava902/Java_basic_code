public class MethodBasic {

    // non static method is call in main by maing obj of its class
    int logic(int x, int y) {

        int z;
        z = x + y;
        return z;

    }

    // static method
    static int add(int x, int y) {

        int z;
        z = x + y;
        return z;

    }

    // method overloading is only done by chnging the parameter

    static void message() {
        System.out.println("Hello");
    }

    static void message(String name) {
        System.out.println("Hello!" + " " + name);
    }

    public static void main(String[] args) {
        // obj of class method basic
        MethodBasic d = new MethodBasic();
        int a = 1;
        int b = 2;

        // call method logic by obj of class
        int c = d.logic(a, b);

        // calling by name of method as it is static method
        int res = add(a, b);

        System.out.println(c + " " + res);

        // call message function
        message();
        message("Harsh");

    }
}
