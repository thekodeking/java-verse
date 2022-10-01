import java.util.ArrayList;

class Permutations {
    public static void main(String[] args) {
        // String str = "abc";
        // permutations(str, "");

        ArrayList<String> ans = pString("abc", "");
        System.out.println(ans);

        // int ans = permutationsCount("abc", "");
        // System.out.println(ans);
    }

    static void permutations(String str, String s){

        if(str.length() == 0){
            System.out.println(s);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String dhiraj = str.substring(0, i)+str.substring(i+1);
            permutations(dhiraj, s+ch);
        }
    }

    static ArrayList<String> pString(String str, String s){
        if(str.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(s);
            return arr;
        }

        ArrayList<String> dhiraj = new ArrayList<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String k = str.substring(0, i)+str.substring(i+1);
            dhiraj.addAll(pString(k, s+ch));
        }

        return dhiraj;
    }

    static int permutationsCount(String str, String s){
        if(str.length() == 0){
            return 1;
        }

        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String dhiraj = str.substring(0, i)+str.substring(i+1);
            count = count+permutationsCount(dhiraj, s+ch);
        }
        return count;
    }
}
