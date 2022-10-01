/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();

            solve(x);
        }
        sc.close();
    }
    
    static void solve(int x){
        if (x < 5) {
            System.out.println("NO");
        } else {
            for (int a = 1; a * a <= x; a++) {
                if ((x - (2 * a)) % (2 + a) == 0 ) {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        }
    }
}
