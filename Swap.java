public class Swap{
    public static void swap(int a,int b){
        int tem = a;
        a =b;
        b = tem;

        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a,b);
        
    }
}