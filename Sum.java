import java.util.*;
public class Sum {
    public static int calculater(int num1,int num2){  //Parameters Or formal parameter   //this is come function define time
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter b number: ");
        int b = sc.nextInt();
        int sum = calculater(a,b);    //argument or actual parameter   // this is come function call time
        System.out.println("sum is: "+sum);

        sc.close();
    }
  
}
