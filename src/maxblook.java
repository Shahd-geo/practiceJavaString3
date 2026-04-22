public class maxblook {
    static void main(String[] args) {

    }
    public static Integer max(String str){
        int block=1;
        int max =0;
        for (int i =0 ;i<str.length();i++){
            if (i<str.length()-1 &&str.charAt(i)==str.charAt(i+1)){
                block++;
            }
        }

    }
}
