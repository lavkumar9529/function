import java.util.*;
public class FuntionOverloding {
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int sum(int a,int b,int c){
        int sum = a+b+c;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int a = sc.nextInt();
        System.out.println("Enter B number: ");
        int b = sc.nextInt();
        System.out.println("Enter C number: ");
        int c = sc.nextInt();

        System.out.println("sum: "+sum(a,b));
        System.out.println("sum: "+sum(a,b,c));

        sc.close();
    }
}
