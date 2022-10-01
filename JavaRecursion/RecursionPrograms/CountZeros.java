import java.util.Scanner;

public class CountZeros {
    public static int countZero(int n, int count){
        if(n%10 ==0){
            count++;
        }
        if(n == 0){
            return count;
        }

        return countZero(n/10,count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = -1;

        sc.close();
        System.out.println(countZero(n,count));
    }
}
