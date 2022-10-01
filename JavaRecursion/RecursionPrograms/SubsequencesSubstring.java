import java.util.ArrayList;

class SubsequencesSubstring{
    public static void main(String[] args) {
        // subseq("","abc");
        System.out.println(arraySebseq("", "abc"));
    }

    static void subseq(String newStr, String str){
        if(str.isEmpty()){
            System.out.println(newStr);
            return;
        }

        subseq(newStr+str.charAt(0), str.substring(1));
        subseq(newStr, str.substring(1));
    }

    static ArrayList<String> arraySebseq(String newStr, String str){
        if(str.isEmpty()){
            ArrayList<String> arr = new ArrayList<String>();
            arr.add(newStr);
            return arr;
        }

        ArrayList<String> leftCalls = arraySebseq(newStr+str.charAt(0), str.substring(1));
        ArrayList<String> rightCalls = arraySebseq(newStr, str.substring(1));

        leftCalls.addAll(rightCalls);
        return leftCalls;
    }
}