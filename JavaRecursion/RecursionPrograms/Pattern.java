
public class Pattern {

    static void printPattern1(int n){
        if(n==0)
        return;

        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        printPattern1(--n);
    }

    static void printPattern2(int n){
        helper2(n,0);
    }

    static void helper2(int r, int c){
        if(r==0)
        return;

        if(c < r){
            helper2(r, ++c);
            System.out.print("* ");
        } else {
            helper2(--r, 0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printPattern1(5);
        printPattern2(5);
    }
}
