public class MethodBasic {

    // non static method is call in main by maing obj of its class
     int logic(int x, int y) {

        int z;
        z = x + y;
        return z;

    }

    //static method
    static int add(int x, int y) {

        int z;
        z = x + y;
        return z;

    }

    public static void main(String[] args) {
        //obj of class method basic 
        MethodBasic d=new MethodBasic();
        int a = 1;
        int b = 2;
        
        //call method logic by obj of class
        int c = d.logic(a, b);

        //calling by name of method as it is static method
        int res=add(a,b);
    
        System.out.print(c+" "+res);

    }
}
