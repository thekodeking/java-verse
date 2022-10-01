public class SkipACharacter {

    public static void removeCharacter(String str, String newStr) {
        if (str.isEmpty()) {
            System.out.println(newStr);
            return;
        }

        if (str.charAt(0) == 'a')
            removeCharacter(str.substring(1), newStr);
        else
            removeCharacter(str.substring(1), newStr + str.charAt(0));
    }

    static String rmCharacter(String str){
        if(str.isEmpty())
        return "";

        if(str.charAt(0) == 'a'){
           return rmCharacter(str.substring(1));
        } else {
           return str.charAt(0)+rmCharacter(str.substring(1));
        }
    }

    static String skipString(String str,String boy){
        if(str.isEmpty())
        return "";

        if(str.startsWith(boy)){
            return skipString(str.substring(boy.length()), boy);
        } else {
            return str.charAt(0)+skipString(str.substring(1),boy);
        }
    }
    public static void main(String[] args) {
        // removeCharacter("abbcaacbadeacf", "");
        // System.out.println(rmCharacter("abbcaacbadeacf"));
        System.out.println(skipString("dhiraj is a boy and mishra","boy"));

    }
}
