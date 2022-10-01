package ArraysInJava;

import java.util.Scanner;

public class ArrayProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many day's Temperature ? ");
        int tempDays = sc.nextInt();
        double avg=0.0;
        int temp[] = new int[tempDays];

        for(int i=0;i<tempDays;i++){
            System.out.print("Day "+(i+1)+"'s high temperature : ");
            temp[i] = sc.nextInt();
            avg = avg+temp[i];
        }

        avg = avg/tempDays;
        int count=0;
        for(int i=0;i<tempDays;i++){
            if(temp[i] > avg)
                count++;
        }
        System.out.println();
        System.out.println("Average = "+avg);
        System.out.println(count+" days above average temperature ");
    }
}
