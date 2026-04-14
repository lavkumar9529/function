import java.util.*;
public class EvenOrodd {
    public static int check(int n){
        if(n%2==0){
            System.out.print("Even number: ");
        }
        else{
            System.out.print("odd number: ");  
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number: ");
        int n = sc.nextInt();

        System.out.println(check(n));

        sc.close();
    }
}
