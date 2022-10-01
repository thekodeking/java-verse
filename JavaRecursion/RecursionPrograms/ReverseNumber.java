import java.util.Scanner;

public class ReverseNumber {
    static int sum =0;
    public static void reverseNum(int n){
        if(n==0)
        return; 
        
            
            int rem = n%10;
            sum = sum*10 + rem;
            reverseNum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        reverseNum(n);

        System.out.println(sum);
    }
}
