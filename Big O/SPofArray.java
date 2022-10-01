package Big_O;

public class SPofArray {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        int sum = 0,product=1;           //->O(1)

        for(int i=0;i<a.length;i++){     //-> O(n)
            sum += a[i];
        }
        for(int i=0;i<a.length;i++){      //-> O(n)
            product *= a[i];
        }

//        Time complexity will be --------> O(n)
    }
}
