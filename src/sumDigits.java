public class sumDigits {
    static void main(String[] args) {
        String str="aa1bc2d3";
        System.out.println(sumDigits(str));

    }

    public static Integer sumDigits(String str){
        int count = 0;
        int sum=0;
        for (int i = 0 ; i<str.length();i++){
            if (Character.isDigit(str.charAt(i))){
                count++;
                sum+=count;
            }
        }

        return sum;

    }

}
