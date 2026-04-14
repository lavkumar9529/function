import java.util.*;
public class product1 {
    public static int mul(int a ,int b){                
        int product = a*b;
        //System.out.println("product is: "+product);
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter b number: ");
        int b = sc.nextInt();
        
        int pro = mul(a,b);
        System.out.println("product is: "+pro );

        sc.close();
    }
}
