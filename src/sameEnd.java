public class sameEnd {
    static void main(String[] args) {
        String str="abXYab";

    }
    public static String sameEnds(String str){
        int leng=str.length();
        String result="";
        for (int i = 0 ; i>=str.length()/2;i++){
            String start=str.substring(0,i);
            String end = str.substring(leng-i);
            if (start.equals(end)){
                result=start;
            }

        }
        return result;

    }
}
