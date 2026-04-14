import java.util.*;
public class Average {
    public static int average(int a,int b,int c){
        int Average =(a+b+c)/3;
        return Average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter b number: ");
        int b = sc.nextInt();
        System.out.println("Enter c number:");
        int c = sc.nextInt();

        System.out.println("Average: "+average(a,b,c));

        sc.close();
    }
}
