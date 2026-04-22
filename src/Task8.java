public class Task8 {
    static void main(String[] args) {
        String str="abXYZba"

    }
    public static String mirrorEnds(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1)) {
                result += str.charAt(i);
            } else {
                break;
            }
        }
        return result;
    }

}
