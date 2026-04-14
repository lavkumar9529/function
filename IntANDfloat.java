import java.util.*;
public class  IntANDfloat {
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static float sum(float c,float d ){
        float sum = c+d ;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int a = sc.nextInt();
        System.out.println("Enter B number: ");
        int  b = sc.nextInt();
        
        System.out.println("Enter C number: ");
        float c = sc.nextFloat();
        System.out.println("Enter D number: ");
        float d = sc.nextFloat();

        System.out.println(sum(a,b));
        System.out.println(sum(c,d ));

        sc.close();
    }
}
 