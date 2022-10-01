import java.util.ArrayList;

public class PhoneNumber {
    public static void main(String[] args) {
        ArrayList<String> ans = solve("", "");
        System.out.println(ans);
    }

    static ArrayList<String> solve(String empty, String str) {
        if (str.isEmpty()) {
            ArrayList<String> arr = new ArrayList<String>();
            if (empty.isEmpty())
                return arr;

            arr.add(empty);
            return arr;
        }

        ArrayList<String> dhiraj = new ArrayList<>();
        int digit = str.charAt(0) - '0';
        if (digit <= 6 && digit >= 2) {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                dhiraj.addAll(solve(empty + ch, str.substring(1)));
            }
        } else if (digit == 8) {
            for (int i = ((digit - 2) * 3) + 1; i < ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                dhiraj.addAll(solve(empty + ch, str.substring(1)));
            }
        } else if (digit == 7) {
            for (int i = (digit - 2) * 3; i < ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                dhiraj.addAll(solve(empty + ch, str.substring(1)));
            }
        } else if (digit == 9) {
            for (int i = ((digit - 2) * 3) + 1; i <= ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                dhiraj.addAll(solve(empty + ch, str.substring(1)));
            }
        } else {
            return dhiraj;
        }
        return dhiraj;
    }
}
