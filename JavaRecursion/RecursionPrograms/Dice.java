public class Dice {
    public static void main(String[] args) {
        int ans = dice(2,6,7);
        System.out.println(ans);
    }

    static int dice(int nDice, int kFaces, int targetSum){

        if(targetSum==0 && nDice==0){
            return 1;
        } 

        if(targetSum==0 && nDice!=0)
        return 0;

        if(targetSum!=0 && nDice==0)
        return 0;

        if(targetSum<0)
        return 0;

        int count = 0;
            for(int j=1;j<=kFaces;j++){
              count = count+dice(nDice-1, kFaces, targetSum-j);
            }

        return count%10000007;
        
    }
}
