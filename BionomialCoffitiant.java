import java.util.*;
public class BionomialCoffitiant {
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;

    }  
    public static int Bionomial(int n,int r){
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n-r);
        int Bionomial = fac_n/(fac_r*fac_nmr);
        return(Bionomial);
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N number: ");
        int n = sc.nextInt();
        System.out.println("Enter R number: ");
        int r = sc.nextInt();

        System.out.println("Factorial: "+factorial(n));
        System.out.println("Bionomial: "+Bionomial(n,r));

        sc.close();
    }

}
