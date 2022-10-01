import java.util.*;
class SumOfDigits{
    public static int sumDigit(int n){
        if(n == 0){
            return 0;
        }

        return (n%10)+sumDigit(n/10);
    }

    public static int productDigit(int n){
        if(n%10 == n){
            return n;
        }

        return (n%10)*productDigit(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        System.out.println(productDigit(n));
    }
}